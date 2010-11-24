package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 18:02:07<br>
 */
public interface EnsemblObject extends Comparable<EnsemblObject> {

    int getId();

    void setId(int id);

    StableID getStableId();

    void setStableId(StableID geneStableId);
    
}
