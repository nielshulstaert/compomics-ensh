package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 15:58:59<br>
 */
public interface Location extends Comparable<Location> {

    SequenceRegion getSequenceRegion();

    void setSequenceRegion(SequenceRegion sequenceRegion);

    int getSequenceRegionStart();

    void setSequenceRegionStart(int sequenceRegionStart);

    int getSequenceRegionEnd();

    void setSequenceRegionEnd(int sequenceRegionEnd);

}
