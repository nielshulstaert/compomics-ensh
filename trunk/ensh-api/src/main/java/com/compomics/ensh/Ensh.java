package com.compomics.ensh;


import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.compomics.ensh.db.EnsemblDataSource;
import com.compomics.ensh.db.EnsemblDataSourceFactory;
import com.compomics.ensh.db.EnsemblDatabaseType;
import com.compomics.ensh.exception.EnshException;
import com.compomics.ensh.util.HibernateUtil;
import com.compomics.ensh.util.XmlUtil;
import com.compomics.ensh.db.EnsemblDataSourceFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 21-Nov-2007<br/>
 * Time: 12:20:07<br/>
 */
public abstract class Ensh {

    private static String hibernateConfigFile = "/uk/ac/ebi/ensh/hibernate.cfg.xml";
    private static List<String> configFiles;
    private static Map<Integer, Map<Integer, SessionFactory>> sessionFactoryCache = new HashMap<Integer, Map<Integer, SessionFactory>>();

    private static EnsemblDataSourceFactory ensemblDataSourceFactory;

    protected static Logger logger = Logger.getLogger(Ensh.class);



    static {
        configFiles = getHibernateConfigFiles();
    }

    /**
     * Returns the Hibernate SessionFactory.
     *
     * @param ncbiTaxonId the NCBI taxon ID of the Ensembl species
     * @return the SessionFactory
     * @throws EnshException if the species specified by the NCBI taxon ID is not in Ensembl,
     *                       an Exception occurs while accessing the Ensembl MySQL database or
     *                       an Exception occurs while creating the Hibernate configuration
     */
    public static SessionFactory getSessionFactory(int ncbiTaxonId) throws EnshException {

        return Ensh.getSessionFactory(ncbiTaxonId, 0);

    }

    /**
     * Returns a Hibernate SessionFactory.
     *
     * @param ncbiTaxonId the NCBI taxon ID of the Ensembl species
     * @param version     the Ensembl release version
     * @return the SessionFactory
     * @throws EnshException if the species specified by the NCBI taxon ID is not in Ensembl,
     *                       an Exception occurs while accessing the Ensembl MySQL database or
     *                       an Exception occurs while creating the Hibernate configuration
     */
    public static SessionFactory getSessionFactory(int ncbiTaxonId, int version) throws EnshException {

        if (version < 0) {
            throw new IllegalArgumentException("Version must not be smaller than 0");
        }
        //check if a session factory for the specified species and version already exists
        //and return it if yes
        if (sessionFactoryCache.containsKey(ncbiTaxonId)) {
            if (sessionFactoryCache.get(ncbiTaxonId).containsKey(version)) {
                return sessionFactoryCache.get(ncbiTaxonId).get(version);
            }
        }

        //if not create it, cache it and return it
        try {

            SessionFactory sessionFactory = createConfiguration(ncbiTaxonId, version).buildSessionFactory();

            //cache SessionFactory
            if (!sessionFactoryCache.containsKey(ncbiTaxonId)) {
                sessionFactoryCache.put(ncbiTaxonId, new HashMap<Integer, SessionFactory>());
            }

            sessionFactoryCache.get(ncbiTaxonId).put(version, sessionFactory);

            return sessionFactory;

        } catch (DocumentException e) {

            throw new EnshException("Exception while creating Hibernate configuration.", e);

        } catch (SQLException e) {

            throw new EnshException("Exception while creating Hibernate configuration.", e);

        }

    }

    /**
     * Creates a Hibernate Configuration which includes mappings from dependencies.
     * The schema of the mapping files are set to the values provided in
     * the Hibernate configuration file of this package.
     *
     * @param taxonId the NCBI taxon ID of the Ensembl species
     * @param version the Ensembl release version
     * @return the Hibernate Configuration
     * @throws org.dom4j.DocumentException if an Exception occurs while accessing the Hibernate configuration and mapping files
     * @throws java.sql.SQLException       if an Exception occurs while connecting to the Ensembl database
     */
    protected static Configuration createConfiguration(int taxonId, int version) throws DocumentException, SQLException {

        logger.info("Creating Hibernate configuration using Hibernate configuration file " + hibernateConfigFile);

        if (ensemblDataSourceFactory == null) {
            ensemblDataSourceFactory = getEnsemblDataSourceFactory(hibernateConfigFile);
        }

        Configuration retVal = new Configuration();

        //add mappings from dependencies

        for (String configFile : configFiles) {


            String ensemblDb = HibernateUtil.getPropertyValue(configFile, "ensembl.db");

            EnsemblDatabaseType ensemblDatabaseType = EnsemblDatabaseType.valueOf(ensemblDb.toUpperCase());

            //get name of Ensembl schema
            String schemaName = ensemblDataSourceFactory.getSchemaName(taxonId, version, ensemblDatabaseType);

            if (schemaName == null) {

                String versionString = "" + version;
                if (version == 0) {
                    versionString = "current";
                }

                logger.info("Database server does not provide Ensembl database of type'" + ensemblDatabaseType.toString().toLowerCase() + "' for species identified by NCBI taxon ID " + taxonId + ", release " + versionString + ". Ignoring mapping files.");

            } else {

                logger.info("Adding mapping files specified in Hibernate configuration file: " + configFile);

                //get Ensh Core and Variation mapping resources
                Set<URL> enshCoreMappingResources = HibernateUtil.getMappingResources(configFile);

                logger.info("Setting schema of mapping files to " + schemaName);

                //set schema of mapping resources and add them to the configuration
                for (URL mappingResource : enshCoreMappingResources) {

                    Document d = HibernateUtil.setMappingCatalogName(mappingResource, schemaName);
                    retVal.addXML(d.asXML());

                }

            }
        }

        //finally configure based on the Hibernate
        //config file but first remove the mapping
        //elements as we have already added them
        //above
        Document hibernatConfigWithoutMapping = HibernateUtil.removeMappingElements(hibernateConfigFile);

        //convert org.dom4j.Document to org.w3c.dom.Document and configure
        retVal.configure(XmlUtil.toOrgW3cDomDocument(hibernatConfigWithoutMapping));

        return retVal;

    }

//    private static String getSchemaName(int taxonId, int version, EnsemblDatabaseType ensemblDb) throws DatabaseException {
//
//        String retVal = null;
//
//        if (ensemblDb.equals(EnsemblDatabaseType.COMPARA) ||
//                ensemblDb.equals(EnsemblDatabaseType.FUNCGEN)
//                ) {
//
//            throw new DatabaseException("Ensembl database type " + ensemblDb + " not supported yet.");
//
//        }
//
//
//        EnsemblDatabase ensemblDatabase = null;
//
//        if (version == 0) {
//            ensemblDatabase = (EnsemblDatabase) ensemblDatabaseFactory.createEnsemblDatabase(taxonId, ensemblDb);
//        } else {
//            ensemblDatabase = (EnsemblDatabase) ensemblDatabaseFactory.createEnsemblDatabase(taxonId, ensemblDb);
//        }
//        retVal = ensemblDatabase.getSchema();
//
//
//        return retVal;
//    }

    /**
     * Returns an EnsemblDatabaseFactory based on the database connection
     * defined in the Hibernate configuration.
     *
     * @param hibernateConfigurationFile
     * @return the EnsemblDatabaseFactory
     * @throws SQLException      if an Exception occurs while opening the database connection
     * @throws DocumentException if an Exception occurs while parsing the Hibernate configuration file
     *
     */
    private static EnsemblDataSourceFactory getEnsemblDataSourceFactory(String hibernateConfigurationFile) throws SQLException, DocumentException {

        Configuration config = new Configuration();

        Document hibernatConfigWithoutMapping = HibernateUtil.removeMappingElements(hibernateConfigurationFile);

        //convert org.dom4j.Document to org.w3c.dom.Document and configure
        Connection conn = config.configure(XmlUtil.toOrgW3cDomDocument(hibernatConfigWithoutMapping))
                .buildSettings()
                .getConnectionProvider()
                .getConnection();

        return new EnsemblDataSourceFactory(conn);

    }

    public static void setHibernateConfigFile(String path) {

        hibernateConfigFile = path;
        configFiles = getHibernateConfigFiles();


    }

    private static List<String> getHibernateConfigFiles() {

        List<String> retVal = new ArrayList<String>();
        Map<EnsemblDatabaseType, String> ensemblDb2ConfigFile = new HashMap<EnsemblDatabaseType, String>();

        try {

//            String ensemblDb = HibernateUtil.getPropertyValue(hibernateConfigFile, "ensembl.db");
//            if (ensemblDb != null) {
//                EnsemblDatabaseType ensemblDbType = EnsemblDatabaseType.valueOf(ensemblDb.toUpperCase());
//                ensemblDb2ConfigFile.put(ensemblDbType, hibernateConfigFile);
//            }

            //get hibernate.cfg files of dependency packages
            for (String configFile : HibernateUtil.getPropertyValuesByPrefix(hibernateConfigFile, "dependency.hibernate.cfg")) {

                String ensemblDb = HibernateUtil.getPropertyValue(configFile, "ensembl.db");
                if (ensemblDb != null) {
                    EnsemblDatabaseType ensemblDbType = EnsemblDatabaseType.valueOf(ensemblDb.toUpperCase());
                    ensemblDb2ConfigFile.put(ensemblDbType, configFile);
                }

            }

            //add configuration files to the list in the order their mapping files have to be parsed

            if (ensemblDb2ConfigFile.containsKey(EnsemblDatabaseType.CORE)) {
                retVal.add(ensemblDb2ConfigFile.get(EnsemblDatabaseType.CORE));
            }

            if (ensemblDb2ConfigFile.containsKey(EnsemblDatabaseType.VARIATION)) {
                retVal.add(ensemblDb2ConfigFile.get(EnsemblDatabaseType.VARIATION));
            }

            if (ensemblDb2ConfigFile.containsKey(EnsemblDatabaseType.MODULE)) {
                retVal.add(ensemblDb2ConfigFile.get(EnsemblDatabaseType.MODULE));
            }

            if (ensemblDb2ConfigFile.containsKey(EnsemblDatabaseType.COMPARA)) {
                retVal.add(ensemblDb2ConfigFile.get(EnsemblDatabaseType.COMPARA));
            }

        } catch (DocumentException e) {
            logger.error("Exception while getting Hibernate config files of dependencies.", e);
        }

        return retVal;
    }

}
