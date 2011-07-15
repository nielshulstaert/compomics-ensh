package com.compomics.ensh.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import java.net.URL;
import java.util.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 21-Nov-2007<br/>
 * Time: 16:34:56<br/>
 * <p/>
 * The SessionFactory provided is based on a Configuration that includes
 * mapping files from dependency jars. Furthermore, the schemas of the
 * dependency mapping files and the mapping files of the package are set
 * to the values provided by the ensembl.schema properties in the
 * Hibernate configuration file of this package.
 */
public abstract class HibernateUtil {

    /**
     * Returns a Document representation of a Hibernate configuration file with
     * the mapping elements removed.
     *
     * @param hibernateConfigurationResoruce the Hibernate configuration file
     * @return a org.dom4j.Document representing the Hibernate configuration
     * @throws DocumentException if an Exception occurs while manipulating the XML document
     */
    public static Document removeMappingElements(String hibernateConfigurationResoruce) throws DocumentException {

        Document d = XmlUtil.parse(HibernateUtil.class.getResource(hibernateConfigurationResoruce));

        Element root = d.getRootElement();
        Element sessionFactory = root.element("session-factory");

        List mappingElements = sessionFactory.elements("mapping");
        for (Object element : mappingElements) {

            if (element instanceof Element) {
                sessionFactory.remove((Element) element);
            }
        }

        return d;
    }

    /**
     * Set the catalog name of the <code>hibernate-mapping<code/> element of a Hibernate mapping file.
     *
     * @param mappingResource the mapping file
     * @param catalogName     the catalog name
     * @return a DOM4J document representation of the altered mapping file
     * @throws DocumentException if an Exception occurs while changing the XML file
     */
    public static Document setMappingCatalogName(URL mappingResource, String catalogName) throws DocumentException {

        Document d = XmlUtil.parse(mappingResource);

        if (d.getRootElement().attribute("catolog") == null) {
            d.getRootElement().addAttribute("catalog", catalogName);
        } else {
            d.getRootElement().attribute("catolog").setValue(catalogName);
        }

        return d;
    }


    /**
     * Returns the mapping resources specified in a Hibernate configuration file
     *
     * @param hibernateConfigurationFile the Hibernate config file
     * @return the URLs of the mapping files
     * @throws DocumentException if an Exception occurs while parsing the Hibernate configuration file
     */
    public static Set<URL> getMappingResources(String hibernateConfigurationFile) throws DocumentException {

        Set<URL> retVal = new HashSet<URL>();

        Document d = XmlUtil.parse(HibernateUtil.class.getResource(hibernateConfigurationFile));
        Element root = d.getRootElement();
        Element sessionFactory = root.element("session-factory");
        for (Iterator i = sessionFactory.elementIterator("mapping"); i.hasNext();) {

            Element e = (Element) i.next();
            String resource = e.attributeValue("resource");
            URL resourceUrl = HibernateUtil.class.getResource(resource);
            retVal.add(resourceUrl);

        }

        return retVal;

    }

    /**
     * Returns the value of the specified Hibernate configuration property.
     *
     * @param hibernateConfigurationFile the Hibernate configuration file
     * @param propertyKey                the property key
     * @return the propertyValue the property value
     * @throws DocumentException if an Exception occurs while accessing the configuration file
     */
    public static String getPropertyValue(String hibernateConfigurationFile, String propertyKey) throws DocumentException {


        Document d = XmlUtil.parse(HibernateUtil.class.getResource(hibernateConfigurationFile));
        Element root = d.getRootElement();
        Element sessionFactory = root.element("session-factory");
        for (Iterator i = sessionFactory.elementIterator("property"); i.hasNext();) {

            Element e = (Element) i.next();
            String name = e.attributeValue("name");
            if (name.equals(propertyKey)) {

                return e.getText();

            }

        }

        return null;
    }

    /**
     * Returns the value of the Hibernate configuration properties starting with the specified name attribute prefix.
     *
     * @param hibernateConfigurationFile  the Hibernate configuration file
     * @param propertyNameAttributePrefix the property name attribute prefix
     * @return the propertyValue the property value
     * @throws DocumentException if an Exception occurs while accessing the configuration file
     */
    public static Set<String> getPropertyValuesByPrefix(String hibernateConfigurationFile, String propertyNameAttributePrefix) throws DocumentException {

        Set<String> retVal = new HashSet<String>();

        Document d = XmlUtil.parse(HibernateUtil.class.getResource(hibernateConfigurationFile));
        Element root = d.getRootElement();
        Element sessionFactory = root.element("session-factory");

        for (Iterator i = sessionFactory.elementIterator("property"); i.hasNext();) {
            Element e = (Element) i.next();
            String name = e.attributeValue("name");
            if (name.startsWith(propertyNameAttributePrefix)) {
                retVal.add(e.getText());
            }
        }

        return retVal;
    }
}