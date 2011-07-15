package com.compomics.ensh.core;

/**
 * This class is a
 */
public class SeqRegionSynonymEntity {
    private int iSeqRegionSynonymId;

    public int getSeqRegionSynonymId() {
        return iSeqRegionSynonymId;
    }

    public void setSeqRegionSynonymId(int aSeqRegionSynonymId) {
        iSeqRegionSynonymId = aSeqRegionSynonymId;
    }

    private int iSeqRegionId;

    public int getSeqRegionId() {
        return iSeqRegionId;
    }

    public void setSeqRegionId(int aSeqRegionId) {
        iSeqRegionId = aSeqRegionId;
    }

    private String iSynonym;

    public String getSynonym() {
        return iSynonym;
    }

    public void setSynonym(String aSynonym) {
        iSynonym = aSynonym;
    }

    private short iExternalDbId;

    public short getExternalDbId() {
        return iExternalDbId;
    }

    public void setExternalDbId(short aExternalDbId) {
        iExternalDbId = aExternalDbId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeqRegionSynonymEntity that = (SeqRegionSynonymEntity) o;

        if (iExternalDbId != that.iExternalDbId) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionSynonymId != that.iSeqRegionSynonymId) return false;
        if (iSynonym != null ? !iSynonym.equals(that.iSynonym) : that.iSynonym != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iSeqRegionSynonymId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + (iSynonym != null ? iSynonym.hashCode() : 0);
        lresult = 31 * lresult + (int) iExternalDbId;
        return lresult;
    }
}
