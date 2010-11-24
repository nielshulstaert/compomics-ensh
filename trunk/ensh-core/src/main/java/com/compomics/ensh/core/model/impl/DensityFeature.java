package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.DensityType;
import com.compomics.ensh.core.model.Analysis;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 13:42:17<br>
 */
public class DensityFeature extends AbstractFeature {

    private DensityType densityType;
    private float densityValue;

    @Testable
    public DensityType getDensityType() {
        return densityType;
    }

    @Testable
    public void setDensityType(DensityType densityType) {
        this.densityType = densityType;
    }

    @Testable
    public float getDensityValue() {
        return densityValue;
    }

    @Testable
    public void setDensityValue(float densityValue) {
        this.densityValue = densityValue;
    }

    public Analysis getAnalysis() {
        return this.getDensityType().getAnalysis();
    }
    public void setAnalysis(Analysis analysis) {
        this.getDensityType().setAnalysis(analysis);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public String toString() {
        return "DensityFeature{" +
                 "analysis=" + this.getAnalysis().getLogicName() +
                ", location=" + location +
                '}';
    }
}
