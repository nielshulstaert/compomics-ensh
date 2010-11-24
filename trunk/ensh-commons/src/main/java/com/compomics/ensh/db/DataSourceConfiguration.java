package com.compomics.ensh.db;

import org.apache.log4j.Logger;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

import javax.naming.ConfigurationException;
import java.util.Properties;
import java.io.IOException;

/**
 * A singleton to provide global access to the configuration properties.
 * <p/>
 * Created by IntelliJ IDEA.<br>
 * User: Michael Mueller<br>
 * Date: 12-Sep-2007<br>
 * Time: 14:24:51<br>
 */
public class DataSourceConfiguration extends PropertiesConfiguration {

    private static String configurationFilePath = "/datasource.properties";

    /**
     * the singleton instance
     */
    private static DataSourceConfiguration ourInstance;

    /**
     * the configuration properties
     */
    private static Properties properties = new Properties();

    /**
     * the log4j logger
     */
    private static Logger logger = Logger.getLogger(DataSourceConfiguration.class);

    /**
     * Returns the Configuration instance.
     *
     * @return the Configuration
     */
    public static DataSourceConfiguration getInstance() {
        if (ourInstance == null){


            try {
                ourInstance = new DataSourceConfiguration();
            } catch (org.apache.commons.configuration.ConfigurationException e) {
                logger.error("Unable to load data source configuration from " + configurationFilePath + ".");
            }

        }

        return ourInstance;
    }

    /**
     * Constructs a singleton object to access the configurtation properties.
     * @throws org.apache.commons.configuration.ConfigurationException
     */
    private DataSourceConfiguration() throws org.apache.commons.configuration.ConfigurationException {
            super(DataSourceConfiguration.class.getResource(configurationFilePath));
    }


}
