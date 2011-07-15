package com.compomics.ensh.core;

/**
 * This class is a
 */
public class DensityTypeEntity {
    private int iDensityTypeId;

    public int getDensityTypeId() {
        return iDensityTypeId;
    }

    public void setDensityTypeId(int aDensityTypeId) {
        iDensityTypeId = aDensityTypeId;
    }

    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
    }

    private int iBlockSize;

    public int getBlockSize() {
        return iBlockSize;
    }

    public void setBlockSize(int aBlockSize) {
        iBlockSize = aBlockSize;
    }

    private int iRegionFeatures;

    public int getRegionFeatures() {
        return iRegionFeatures;
    }

    public void setRegionFeatures(int aRegionFeatures) {
        iRegionFeatures = aRegionFeatures;
    }

    private String iValueType;

    public String getValueType() {
        return iValueType;
    }

    public void setValueType(String aValueType) {
        iValueType = aValueType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DensityTypeEntity that = (DensityTypeEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iBlockSize != that.iBlockSize) return false;
        if (iDensityTypeId != that.iDensityTypeId) return false;
        if (iRegionFeatures != that.iRegionFeatures) return false;
        if (iValueType != null ? !iValueType.equals(that.iValueType) : that.iValueType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iDensityTypeId;
        lresult = 31 * lresult + (int) iAnalysisId;
        lresult = 31 * lresult + iBlockSize;
        lresult = 31 * lresult + iRegionFeatures;
        lresult = 31 * lresult + (iValueType != null ? iValueType.hashCode() : 0);
        return lresult;
    }
}
