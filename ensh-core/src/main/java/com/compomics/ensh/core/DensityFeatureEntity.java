package com.compomics.ensh.core;

/**
 * This class is a
 */
public class DensityFeatureEntity {
    private int iDensityFeatureId;

    public int getDensityFeatureId() {
        return iDensityFeatureId;
    }

    public void setDensityFeatureId(int aDensityFeatureId) {
        iDensityFeatureId = aDensityFeatureId;
    }

    private int iDensityTypeId;

    public int getDensityTypeId() {
        return iDensityTypeId;
    }

    public void setDensityTypeId(int aDensityTypeId) {
        iDensityTypeId = aDensityTypeId;
    }

    private int iSeqRegionId;

    public int getSeqRegionId() {
        return iSeqRegionId;
    }

    public void setSeqRegionId(int aSeqRegionId) {
        iSeqRegionId = aSeqRegionId;
    }

    private int iSeqRegionStart;

    public int getSeqRegionStart() {
        return iSeqRegionStart;
    }

    public void setSeqRegionStart(int aSeqRegionStart) {
        iSeqRegionStart = aSeqRegionStart;
    }

    private int iSeqRegionEnd;

    public int getSeqRegionEnd() {
        return iSeqRegionEnd;
    }

    public void setSeqRegionEnd(int aSeqRegionEnd) {
        iSeqRegionEnd = aSeqRegionEnd;
    }

    private float iDensityValue;

    public float getDensityValue() {
        return iDensityValue;
    }

    public void setDensityValue(float aDensityValue) {
        iDensityValue = aDensityValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DensityFeatureEntity that = (DensityFeatureEntity) o;

        if (iDensityFeatureId != that.iDensityFeatureId) return false;
        if (iDensityTypeId != that.iDensityTypeId) return false;
        if (Float.compare(that.iDensityValue, iDensityValue) != 0) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iDensityFeatureId;
        lresult = 31 * lresult + iDensityTypeId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (iDensityValue != +0.0f ? Float.floatToIntBits(iDensityValue) : 0);
        return lresult;
    }
}
