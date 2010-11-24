package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.Location;
import com.compomics.ensh.core.model.StrandedLocation;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 16:08:01<br>
 */
public class StrandedLocationImpl extends LocationImpl implements StrandedLocation {

    private int sequenceRegionStrand;


    @Testable
    public int getSequenceRegionStrand() {
        return sequenceRegionStrand;
    }

    @Testable
    public void setSequenceRegionStrand(int sequenceRegionStrand) {
        this.sequenceRegionStrand = sequenceRegionStrand;
    }

    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof StrandedLocation)) return false;

        StrandedLocation location = (StrandedLocation) o;

        if (!sequenceRegion.equals(location.getSequenceRegion())) return false;
        if (sequenceRegionStart != location.getSequenceRegionStart()) return false;
        if (sequenceRegionEnd != location.getSequenceRegionEnd()) return false;
        if (sequenceRegionStrand != location.getSequenceRegionStrand()) return false;

        return true;
    }


    public int compareTo(Location that) {

        if(this == that) return 0;

        if(this.equals(that)) return 0;

        if(!this.getSequenceRegion().equals(that.getSequenceRegion()))
            return this.getSequenceRegion().compareTo(that.getSequenceRegion());

        if(this.getSequenceRegionStart() != that.getSequenceRegionStart())
            return new Integer(this.getSequenceRegionStart()).compareTo(that.getSequenceRegionStart());

        if(this.getSequenceRegionEnd() != that.getSequenceRegionEnd())
                    return new Integer(this.getSequenceRegionStart()).compareTo(that.getSequenceRegionStart());

        if(that instanceof StrandedLocation){

            StrandedLocation thatSL = (StrandedLocation)that;
            return new Integer(this.sequenceRegionStrand).compareTo(thatSL.getSequenceRegionStrand());

        }

        return 1;

    }

    public String toString() {
            String strand = "0";
            if (sequenceRegionStrand == -1) {
                strand = "-";
            } else if (sequenceRegionStrand == 1) {
                strand = "+";
            }
            return super.toString() + "(" + strand + ")";
        }

}
