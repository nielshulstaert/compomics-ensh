package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 12-Oct-2007<br>
 * Time: 09:39:32<br>
 */
public interface GeneticMarkerFeature extends Feature {
    GeneticMarker getMarker();

    void setMarker(GeneticMarker marker);

    int getMapWeight();

    void setMapWeight(int mapWeight);
}
