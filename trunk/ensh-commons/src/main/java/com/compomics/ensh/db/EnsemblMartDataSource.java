package com.compomics.ensh.db;

import java.util.Map;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.commons.dbcp.BasicDataSource;


/**
 * Provides access to the Ensembl Mart schemas.
 *
 * Created by IntelliJ IDEA.<br>
 * User: Michael Mueller<br>
 * Date: 21-Sep-2007<br>
 * Time: 12:58:07<br>
 */
public class EnsemblMartDataSource extends EnsemblDataSource {

    protected Map<Integer, String> ncbiTaxonId2SpeciesName;

    /**
     * Returns the Ensembl Mart schema table prefix for the species of this EnsemblMartDatabase object.
     *
     * @return the database prefix
     */
    public String getTableNamePrefix() {

        return super.speciesName.split(" ")[1].substring(0, 1) + //the first character of the species name
                super.speciesName.split("_")[2];

    }

    /**
     * Returns the Ensembl Mart schema table prefix for the species identified by the NCBI taxon ID.
     *
     * @return the database prefix
     * @param ncbiTaxonId the NCBI taxon ID
     */
    public String getTableNamePrefix(int ncbiTaxonId) {

        String speciesName = ncbiTaxonId2SpeciesName.get(ncbiTaxonId);
        return speciesName.split(" ")[1].substring(0, 1) + //the first character of the species name
                speciesName.split("_")[2];

    }

}
