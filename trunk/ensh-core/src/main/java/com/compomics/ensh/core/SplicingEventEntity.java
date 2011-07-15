package com.compomics.ensh.core;

/**
 * This class is a
 */
public class SplicingEventEntity {
    private int iSplicingEventId;

    public int getSplicingEventId() {
        return iSplicingEventId;
    }

    public void setSplicingEventId(int aSplicingEventId) {
        iSplicingEventId = aSplicingEventId;
    }

    private String iName;

    public String getName() {
        return iName;
    }

    public void setName(String aName) {
        iName = aName;
    }

    private int iGeneId;

    public int getGeneId() {
        return iGeneId;
    }

    public void setGeneId(int aGeneId) {
        iGeneId = aGeneId;
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

    private short iAttribTypeId;

    public short getAttribTypeId() {
        return iAttribTypeId;
    }

    public void setAttribTypeId(short aAttribTypeId) {
        iAttribTypeId = aAttribTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SplicingEventEntity that = (SplicingEventEntity) o;

        if (iAttribTypeId != that.iAttribTypeId) return false;
        if (iGeneId != that.iGeneId) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;
        if (iSplicingEventId != that.iSplicingEventId) return false;
        if (iName != null ? !iName.equals(that.iName) : that.iName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iSplicingEventId;
        lresult = 31 * lresult + (iName != null ? iName.hashCode() : 0);
        lresult = 31 * lresult + iGeneId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (int) iSeqRegionStrand;
        lresult = 31 * lresult + (int) iAttribTypeId;
        return lresult;
    }
}
