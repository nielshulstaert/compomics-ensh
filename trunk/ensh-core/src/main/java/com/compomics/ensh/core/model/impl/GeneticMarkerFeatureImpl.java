package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.GeneticMarker;
import com.compomics.ensh.core.model.GeneticMarkerFeature;


/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 10:24:22<br>
 */
public class GeneticMarkerFeatureImpl extends AbstractFeature implements GeneticMarkerFeature {

    private GeneticMarker marker;
    private int mapWeight;

    @Testable
    public GeneticMarker getMarker() {
        return marker;
    }

    @Testable
    public void setMarker(GeneticMarker marker) {
        this.marker = marker;
    }

    @Testable
    public int getMapWeight() {
        return mapWeight;
    }

    @Testable
    public void setMapWeight(int mapWeight) {
        this.mapWeight = mapWeight;
    }


    public String toString() {
        return "GeneticMarkerFeatureImpl{" +
                 "analysis=" + analysis.getLogicName() +
                ", location=" + location +
                '}';
    }
}
