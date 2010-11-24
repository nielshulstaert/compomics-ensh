package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.GeneticMarkerSynonymImpl;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 15:20:08<br>
 */
public interface GeneticMapLocation extends Comparable <GeneticMapLocation> {

    GeneticMap getMap();

    void setMap(GeneticMap map);

    String getChromosomeName();

    void setChromosomeName(String chromosomeName);

    GeneticMarkerSynonym getMarkerName();

    void setMarkerName(GeneticMarkerSynonym markerName);

    String getPosition();

    void setPosition(String position);

    Double getLodScore();

    void setLodScore(Double lodScore);
}
