package com.compomics.ensh.core.model;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 15:13:46<br>
 */
public interface GeneticMap extends Comparable<GeneticMap> {

    String getName();

    void setName(String name);

    Set<GeneticMarker> getMarkers();

    void setMarkers(Set<GeneticMarker> markers);

}
