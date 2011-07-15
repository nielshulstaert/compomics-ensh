package com.compomics.ensh.core;

/**
 * This class is a
 */
public class AssemblyEntity {
    private int iAsmSeqRegionId;

    public int getAsmSeqRegionId() {
        return iAsmSeqRegionId;
    }

    public void setAsmSeqRegionId(int aAsmSeqRegionId) {
        iAsmSeqRegionId = aAsmSeqRegionId;
    }

    private int iCmpSeqRegionId;

    public int getCmpSeqRegionId() {
        return iCmpSeqRegionId;
    }

    public void setCmpSeqRegionId(int aCmpSeqRegionId) {
        iCmpSeqRegionId = aCmpSeqRegionId;
    }

    private int iAsmStart;

    public int getAsmStart() {
        return iAsmStart;
    }

    public void setAsmStart(int aAsmStart) {
        iAsmStart = aAsmStart;
    }

    private int iAsmEnd;

    public int getAsmEnd() {
        return iAsmEnd;
    }

    public void setAsmEnd(int aAsmEnd) {
        iAsmEnd = aAsmEnd;
    }

    private int iCmpStart;

    public int getCmpStart() {
        return iCmpStart;
    }

    public void setCmpStart(int aCmpStart) {
        iCmpStart = aCmpStart;
    }

    private int iCmpEnd;

    public int getCmpEnd() {
        return iCmpEnd;
    }

    public void setCmpEnd(int aCmpEnd) {
        iCmpEnd = aCmpEnd;
    }

    private byte iOri;

    public byte getOri() {
        return iOri;
    }

    public void setOri(byte aOri) {
        iOri = aOri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssemblyEntity that = (AssemblyEntity) o;

        if (iAsmEnd != that.iAsmEnd) return false;
        if (iAsmSeqRegionId != that.iAsmSeqRegionId) return false;
        if (iAsmStart != that.iAsmStart) return false;
        if (iCmpEnd != that.iCmpEnd) return false;
        if (iCmpSeqRegionId != that.iCmpSeqRegionId) return false;
        if (iCmpStart != that.iCmpStart) return false;
        if (iOri != that.iOri) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iAsmSeqRegionId;
        lresult = 31 * lresult + iCmpSeqRegionId;
        lresult = 31 * lresult + iAsmStart;
        lresult = 31 * lresult + iAsmEnd;
        lresult = 31 * lresult + iCmpStart;
        lresult = 31 * lresult + iCmpEnd;
        lresult = 31 * lresult + (int) iOri;
        return lresult;
    }
}
