package com.compomics.ensh.core;

/**
 * This class is a
 */
public class ExonEntity {
    private int iExonId;

    public int getExonId() {
        return iExonId;
    }

    public void setExonId(int aExonId) {
        iExonId = aExonId;
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

    private byte iPhase;

    public byte getPhase() {
        return iPhase;
    }

    public void setPhase(byte aPhase) {
        iPhase = aPhase;
    }

    private byte iEndPhase;

    public byte getEndPhase() {
        return iEndPhase;
    }

    public void setEndPhase(byte aEndPhase) {
        iEndPhase = aEndPhase;
    }

    private boolean iIsCurrent;

    public boolean isIsCurrent() {
        return iIsCurrent;
    }

    public void setIsCurrent(boolean aIsCurrent) {
        iIsCurrent = aIsCurrent;
    }

    private boolean iIsConstitutive;

    public boolean isIsConstitutive() {
        return iIsConstitutive;
    }

    public void setIsConstitutive(boolean aIsConstitutive) {
        iIsConstitutive = aIsConstitutive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExonEntity that = (ExonEntity) o;

        if (iEndPhase != that.iEndPhase) return false;
        if (iExonId != that.iExonId) return false;
        if (iIsConstitutive != that.iIsConstitutive) return false;
        if (iIsCurrent != that.iIsCurrent) return false;
        if (iPhase != that.iPhase) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iExonId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (int) iSeqRegionStrand;
        lresult = 31 * lresult + (int) iPhase;
        lresult = 31 * lresult + (int) iEndPhase;
        lresult = 31 * lresult + (iIsCurrent ? 1 : 0);
        lresult = 31 * lresult + (iIsConstitutive ? 1 : 0);
        return lresult;
    }
}
