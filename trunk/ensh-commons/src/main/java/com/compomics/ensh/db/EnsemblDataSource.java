package com.compomics.ensh.db;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.SQLException;

/**
 * Provides access to Ensembl core schemas.
 * <p/>
 * Created by IntelliJ IDEA.<br>
 * User: Michael Mueller<br>
 * Date: 21-Sep-2007<br>
 * Time: 12:58:18<br>
 */
public class EnsemblDataSource extends BasicDataSource {

    /**
     * The name of the species for this Database object
     */
    protected String speciesName;

    /**
     * The NCBI taxon ID of the species for this Database object
     */
    protected int ncbiTaxonId;

    /**
     * The release version of the Ensembl core schema of this Database object
     */
    protected int release;

    ///////////////////
    //getters & setters

    /**
     * Returns the NCBI taxon ID of the species this Database object provides access to.
     *
     * @return the species NCBI taxon ID
     */
    public int getNcbiTaxonId() {
        return ncbiTaxonId;
    }


    /**
     * Returns the Ensembl release version this Database object provides access to.
     *
     * @return the release version
     */
    public int getRelease() {
        return release;
    }

    public EnsemblDataSource() {
    }

    /**
     * Returns the species name for the core database represented by this Database object.
     *
     * @return the species name
     */
    public String getSpeciesName() {
        return speciesName;
    }

    public <T> T unwrap(Class<T> tClass) throws SQLException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isWrapperFor(Class<?> aClass) throws SQLException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    protected void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    protected void setNcbiTaxonId(int ncbiTaxonId) {
        this.ncbiTaxonId = ncbiTaxonId;
    }

    protected void setRelease(int release) {
        this.release = release;
    }
}
