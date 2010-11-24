package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.Analysis;
import com.compomics.ensh.core.model.DensityType;
import test.Testable;


/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 13:49:54<br>
 */
public class DensityTypeImpl implements DensityType {

    private int id;
    private Analysis analysis;
    private int blockSize;
    private int regionFeatures;
    private String valueType;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public Analysis getAnalysis() {
        return analysis;
    }

    @Testable
    public void setAnalysis(Analysis analysis) {
        this.analysis = analysis;
    }

    @Testable
    public int getBlockSize() {
        return blockSize;
    }

    @Testable
    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    @Testable
    public int getRegionFeatures() {
        return regionFeatures;
    }

    @Testable
    public void setRegionFeatures(int regionFeatures) {
        this.regionFeatures = regionFeatures;
    }

    @Testable
    public String getValueType() {
        return valueType;
    }

    @Testable
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof DensityType)) return false;

        DensityType that = (DensityType) o;

        if (blockSize != that.getBlockSize()) return false;
        if (regionFeatures != that.getRegionFeatures()) return false;
        if (!analysis.equals(that.getAnalysis())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = analysis.hashCode();
        result = 31 * result + blockSize;
        result = 31 * result + regionFeatures;
        return result;
    }


    public String toString() {
        return "DensityTypeImpl{" +
                "analysis=" + analysis +
                ", blockSize=" + blockSize +
                ", regionFeatures=" + regionFeatures +
                ", valueType='" + valueType + '\'' +
                '}';
    }
}
