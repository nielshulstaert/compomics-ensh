package com.compomics.ensh.core;

/**
 * This class is a
 */
public class SeqRegionMappingEntity {
    private int iExternalSeqRegionId;

    public int getExternalSeqRegionId() {
        return iExternalSeqRegionId;
    }

    public void setExternalSeqRegionId(int aExternalSeqRegionId) {
        iExternalSeqRegionId = aExternalSeqRegionId;
    }

    private int iInternalSeqRegionId;

    public int getInternalSeqRegionId() {
        return iInternalSeqRegionId;
    }

    public void setInternalSeqRegionId(int aInternalSeqRegionId) {
        iInternalSeqRegionId = aInternalSeqRegionId;
    }

    private int iMappingSetId;

    public int getMappingSetId() {
        return iMappingSetId;
    }

    public void setMappingSetId(int aMappingSetId) {
        iMappingSetId = aMappingSetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeqRegionMappingEntity that = (SeqRegionMappingEntity) o;

        if (iExternalSeqRegionId != that.iExternalSeqRegionId) return false;
        if (iInternalSeqRegionId != that.iInternalSeqRegionId) return false;
        if (iMappingSetId != that.iMappingSetId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iExternalSeqRegionId;
        lresult = 31 * lresult + iInternalSeqRegionId;
        lresult = 31 * lresult + iMappingSetId;
        return lresult;
    }
}
