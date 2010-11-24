package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.DitagFeature;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 10:14:37<br>
 */
public interface Ditag {
    String getName();

    void setName(String name);

    String getType();

    void setType(String type);

    int getTagCount();

    void setTagCount(int tagCount);

    String getSequence();

    void setSequence(String sequence);

    Set<DitagFeature> getGenomeLocations();

    void setGenomeLocations(Set<DitagFeature> genomeLocations);
}
