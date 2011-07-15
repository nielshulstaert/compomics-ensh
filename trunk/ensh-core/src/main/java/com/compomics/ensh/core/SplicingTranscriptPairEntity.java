package com.compomics.ensh.core;

/**
 * This class is a
 */
public class SplicingTranscriptPairEntity {
    private int iSplicingTranscriptPairId;

    public int getSplicingTranscriptPairId() {
        return iSplicingTranscriptPairId;
    }

    public void setSplicingTranscriptPairId(int aSplicingTranscriptPairId) {
        iSplicingTranscriptPairId = aSplicingTranscriptPairId;
    }

    private int iSplicingEventId;

    public int getSplicingEventId() {
        return iSplicingEventId;
    }

    public void setSplicingEventId(int aSplicingEventId) {
        iSplicingEventId = aSplicingEventId;
    }

    private int iTranscriptId1;

    public int getTranscriptId1() {
        return iTranscriptId1;
    }

    public void setTranscriptId1(int aTranscriptId1) {
        iTranscriptId1 = aTranscriptId1;
    }

    private int iTranscriptId2;

    public int getTranscriptId2() {
        return iTranscriptId2;
    }

    public void setTranscriptId2(int aTranscriptId2) {
        iTranscriptId2 = aTranscriptId2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SplicingTranscriptPairEntity that = (SplicingTranscriptPairEntity) o;

        if (iSplicingEventId != that.iSplicingEventId) return false;
        if (iSplicingTranscriptPairId != that.iSplicingTranscriptPairId) return false;
        if (iTranscriptId1 != that.iTranscriptId1) return false;
        if (iTranscriptId2 != that.iTranscriptId2) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iSplicingTranscriptPairId;
        lresult = 31 * lresult + iSplicingEventId;
        lresult = 31 * lresult + iTranscriptId1;
        lresult = 31 * lresult + iTranscriptId2;
        return lresult;
    }
}
