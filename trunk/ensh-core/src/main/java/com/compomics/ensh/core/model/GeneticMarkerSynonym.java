package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 17:27:50<br>
 */
public interface GeneticMarkerSynonym {
    GeneticMarker getMarker();

    void setMarker(GeneticMarker marker);

    String getSource();

    void setSource(String source);

    String getName();

    void setName(String name);
}
