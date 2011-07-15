package com.compomics.ensh.core;

/**
 * This class is a
 */
public class SeqRegionEntity {
    private int iSeqRegionId;

    public int getSeqRegionId() {
        return iSeqRegionId;
    }

    public void setSeqRegionId(int aSeqRegionId) {
        iSeqRegionId = aSeqRegionId;
    }

    private String iName;

    public String getName() {
        return iName;
    }

    public void setName(String aName) {
        iName = aName;
    }

    private int iCoordSystemId;

    public int getCoordSystemId() {
        return iCoordSystemId;
    }

    public void setCoordSystemId(int aCoordSystemId) {
        iCoordSystemId = aCoordSystemId;
    }

    private int iLength;

    public int getLength() {
        return iLength;
    }

    public void setLength(int aLength) {
        iLength = aLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeqRegionEntity that = (SeqRegionEntity) o;

        if (iCoordSystemId != that.iCoordSystemId) return false;
        if (iLength != that.iLength) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iName != null ? !iName.equals(that.iName) : that.iName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iSeqRegionId;
        lresult = 31 * lresult + (iName != null ? iName.hashCode() : 0);
        lresult = 31 * lresult + iCoordSystemId;
        lresult = 31 * lresult + iLength;
        return lresult;
    }
}
