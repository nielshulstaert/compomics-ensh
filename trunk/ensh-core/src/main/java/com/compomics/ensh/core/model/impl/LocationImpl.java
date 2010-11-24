package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.SequenceRegion;
import com.compomics.ensh.core.model.Location;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 16:06:18<br>
 */
public class LocationImpl implements Location {

    protected SequenceRegion sequenceRegion;
    protected int sequenceRegionStart;
    protected int sequenceRegionEnd;

    @Testable
    public SequenceRegion getSequenceRegion() {
        return sequenceRegion;
    }

    @Testable
    public void setSequenceRegion(SequenceRegion sequenceRegion) {
        this.sequenceRegion = sequenceRegion;
    }

    @Testable
    public int getSequenceRegionStart() {
        return sequenceRegionStart;
    }

    @Testable
    public void setSequenceRegionStart(int sequenceRegionStart) {
        this.sequenceRegionStart = sequenceRegionStart;
    }

    @Testable
    public int getSequenceRegionEnd() {
        return sequenceRegionEnd;
    }

    @Testable
    public void setSequenceRegionEnd(int sequenceRegionEnd) {
        this.sequenceRegionEnd = sequenceRegionEnd;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Location)) return false;

        Location location = (Location) o;

        if (!sequenceRegion.equals(location.getSequenceRegion())) return false;
        if (sequenceRegionStart != location.getSequenceRegionStart()) return false;
        if (sequenceRegionEnd != location.getSequenceRegionEnd()) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = sequenceRegion.hashCode();
        result = 31 * result + sequenceRegionStart;
        result = 31 * result + sequenceRegionEnd;
        return result;
    }

    @Testable
    public int compareTo(Location that) {
        int BEFORE = -1;
        int EQUAL = 0;
        int AFTER = 1;

        if(this == that) return EQUAL;

        if(this.equals(that)) return EQUAL;

        if(!this.getSequenceRegion().equals(that.getSequenceRegion()))
            return this.getSequenceRegion().compareTo(that.getSequenceRegion());

        if(this.getSequenceRegionStart() != that.getSequenceRegionStart())
            return new Integer(this.getSequenceRegionStart()).compareTo(that.getSequenceRegionStart());

        return new Integer(this.getSequenceRegionEnd()).compareTo(that.getSequenceRegionEnd());

    }

    public String toString() {
           return sequenceRegion.getCoordinateSystem().getName() + " " +
                  sequenceRegion.getName() + ":" +
                  sequenceRegionStart + "-" + sequenceRegionEnd;
       }

}
