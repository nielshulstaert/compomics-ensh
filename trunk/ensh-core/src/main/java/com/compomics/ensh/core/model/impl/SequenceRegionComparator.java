package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.SequenceRegion;

import java.util.Comparator;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 15:22:07<br>
 */
public class SequenceRegionComparator implements Comparator<SequenceRegion> {

    @Testable
    public int compare(SequenceRegion sequenceRegion1, SequenceRegion sequenceRegion2) {
        return sequenceRegion1.compareTo(sequenceRegion2);
    }
}
