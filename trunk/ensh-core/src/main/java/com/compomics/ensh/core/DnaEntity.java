package com.compomics.ensh.core;

/**
 * This class is a
 */
public class DnaEntity {
    private int iSeqRegionId;

    public int getSeqRegionId() {
        return iSeqRegionId;
    }

    public void setSeqRegionId(int aSeqRegionId) {
        iSeqRegionId = aSeqRegionId;
    }

    private String iSequence;

    public String getSequence() {
        return iSequence;
    }

    public void setSequence(String aSequence) {
        iSequence = aSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DnaEntity that = (DnaEntity) o;

        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSequence != null ? !iSequence.equals(that.iSequence) : that.iSequence != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iSeqRegionId;
        lresult = 31 * lresult + (iSequence != null ? iSequence.hashCode() : 0);
        return lresult;
    }
}
