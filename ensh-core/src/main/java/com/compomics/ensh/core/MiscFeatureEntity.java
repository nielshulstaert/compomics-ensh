package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MiscFeatureEntity {
    private int iMiscFeatureId;

    public int getMiscFeatureId() {
        return iMiscFeatureId;
    }

    public void setMiscFeatureId(int aMiscFeatureId) {
        iMiscFeatureId = aMiscFeatureId;
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

    private byte iSeqRegionStrand;

    public byte getSeqRegionStrand() {
        return iSeqRegionStrand;
    }

    public void setSeqRegionStrand(byte aSeqRegionStrand) {
        iSeqRegionStrand = aSeqRegionStrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MiscFeatureEntity that = (MiscFeatureEntity) o;

        if (iMiscFeatureId != that.iMiscFeatureId) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMiscFeatureId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (int) iSeqRegionStrand;
        return lresult;
    }
}
