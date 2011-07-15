package com.compomics.ensh.core;

/**
 * This class is a
 */
public class ExonTranscriptEntity {
    private int iExonId;

    public int getExonId() {
        return iExonId;
    }

    public void setExonId(int aExonId) {
        iExonId = aExonId;
    }

    private int iTranscriptId;

    public int getTranscriptId() {
        return iTranscriptId;
    }

    public void setTranscriptId(int aTranscriptId) {
        iTranscriptId = aTranscriptId;
    }

    private int iRank;

    public int getRank() {
        return iRank;
    }

    public void setRank(int aRank) {
        iRank = aRank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExonTranscriptEntity that = (ExonTranscriptEntity) o;

        if (iExonId != that.iExonId) return false;
        if (iRank != that.iRank) return false;
        if (iTranscriptId != that.iTranscriptId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iExonId;
        lresult = 31 * lresult + iTranscriptId;
        lresult = 31 * lresult + iRank;
        return lresult;
    }
}
