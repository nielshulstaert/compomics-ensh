package com.compomics.ensh.core;

/**
 * This class is a
 */
public class KaryotypeEntity {
    private int iKaryotypeId;

    public int getKaryotypeId() {
        return iKaryotypeId;
    }

    public void setKaryotypeId(int aKaryotypeId) {
        iKaryotypeId = aKaryotypeId;
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

    private String iBand;

    public String getBand() {
        return iBand;
    }

    public void setBand(String aBand) {
        iBand = aBand;
    }

    private String iStain;

    public String getStain() {
        return iStain;
    }

    public void setStain(String aStain) {
        iStain = aStain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KaryotypeEntity that = (KaryotypeEntity) o;

        if (iKaryotypeId != that.iKaryotypeId) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iBand != null ? !iBand.equals(that.iBand) : that.iBand != null) return false;
        if (iStain != null ? !iStain.equals(that.iStain) : that.iStain != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iKaryotypeId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (iBand != null ? iBand.hashCode() : 0);
        lresult = 31 * lresult + (iStain != null ? iStain.hashCode() : 0);
        return lresult;
    }
}
