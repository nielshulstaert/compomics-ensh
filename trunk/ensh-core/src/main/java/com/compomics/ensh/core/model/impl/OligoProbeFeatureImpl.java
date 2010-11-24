package com.compomics.ensh.core.model.impl;


import com.compomics.ensh.core.model.OligoProbeFeature;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 28-Sep-2007<br>
 * Time: 17:09:44<br>
 */
public class OligoProbeFeatureImpl extends AbstractStrandedFeature implements OligoProbeFeature {

    private int mismatches;
    private int oligoProbeId;

    @Testable
    public int getMismatches() {
        return mismatches;
    }

    @Testable
    public void setMismatches(int mismatches) {
        this.mismatches = mismatches;
    }

    @Testable
    public int getOligoProbeId() {
        return oligoProbeId;
    }

    @Testable
    public void setOligoProbeId(int oligoProbeId) {
        this.oligoProbeId = oligoProbeId;
    }


    public String toString() {
        return "OligoProbeFeatureImpl{" +
                "analysis=" + analysis.getLogicName() +
                ", location=" + location +
                '}';
    }
}
