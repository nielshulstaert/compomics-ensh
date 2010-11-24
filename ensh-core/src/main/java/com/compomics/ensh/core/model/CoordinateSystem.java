package com.compomics.ensh.core.model;

import java.util.Set;
import java.util.SortedSet;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 14:34:08<br>
 */
public interface CoordinateSystem extends Comparable<CoordinateSystem> {

    String getName();

    void setName(String name);

    String getVersion();

    void setVersion(String version);

    int getRank();

    void setRank(int rank);

    String getAttributes();

    void setAttributes(String attributes);

    Set<SequenceRegion> getSequenceRegions();

    void setSequenceRegions(SortedSet<SequenceRegion> sequenceRegions);
}
