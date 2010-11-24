package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.Exon;
import com.compomics.ensh.core.model.StrandedLocation;

import java.util.Comparator;

/**
 * Comparator to order Exons by their location on the SequenceRegion. If the location
 * is on the minus strand the Exons are ordered in descending order of the sequence
 * region start. If the location is on the plus strand they are ordered in ascending
 * order of the sequence region start. This ensures that Exon 1 is the first item in
 * a collection order using this comparator.
 * <p/>
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 27-Sep-2007<br/>
 * Time: 16:44:32<br/>
 */
public class TranscriptExonComparator implements Comparator<Exon> {


    /**
     * Compares to Exons based on the location.
     *
     * @param exon1 Exon one
     * @param exon2 Exon two
     * @return 0 (exon1 equals exon2), 1 (exon1 smaller exon2) , -1 (exon1 greater exon2)
     */
    @Testable
    public int compare(Exon exon1, Exon exon2) {

        int EQUAL = 0;

        if (exon1 == exon2) return EQUAL;

        if (exon1.equals(exon2)) return EQUAL;

        //order by sequence region start and strand
        StrandedLocation location1 = exon1.getLocation();
        StrandedLocation location2 = exon2.getLocation();

        Integer sequenceRegionStart1 = location1.getSequenceRegionStart();
        Integer sequenceRegionStart2 = location2.getSequenceRegionStart();

        int sequenceRegionComparison = sequenceRegionStart1.compareTo(sequenceRegionStart2);

        return sequenceRegionComparison * location1.getSequenceRegionStrand();

    }

}
