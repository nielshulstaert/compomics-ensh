package com.compomics.ensh.core;

/**
 * This class is a
 */
public class TranslationEntity {
    private int iTranslationId;

    public int getTranslationId() {
        return iTranslationId;
    }

    public void setTranslationId(int aTranslationId) {
        iTranslationId = aTranslationId;
    }

    private int iTranscriptId;

    public int getTranscriptId() {
        return iTranscriptId;
    }

    public void setTranscriptId(int aTranscriptId) {
        iTranscriptId = aTranscriptId;
    }

    private int iSeqStart;

    public int getSeqStart() {
        return iSeqStart;
    }

    public void setSeqStart(int aSeqStart) {
        iSeqStart = aSeqStart;
    }

    private int iStartExonId;

    public int getStartExonId() {
        return iStartExonId;
    }

    public void setStartExonId(int aStartExonId) {
        iStartExonId = aStartExonId;
    }

    private int iSeqEnd;

    public int getSeqEnd() {
        return iSeqEnd;
    }

    public void setSeqEnd(int aSeqEnd) {
        iSeqEnd = aSeqEnd;
    }

    private int iEndExonId;

    public int getEndExonId() {
        return iEndExonId;
    }

    public void setEndExonId(int aEndExonId) {
        iEndExonId = aEndExonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TranslationEntity that = (TranslationEntity) o;

        if (iEndExonId != that.iEndExonId) return false;
        if (iSeqEnd != that.iSeqEnd) return false;
        if (iSeqStart != that.iSeqStart) return false;
        if (iStartExonId != that.iStartExonId) return false;
        if (iTranscriptId != that.iTranscriptId) return false;
        if (iTranslationId != that.iTranslationId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iTranslationId;
        lresult = 31 * lresult + iTranscriptId;
        lresult = 31 * lresult + iSeqStart;
        lresult = 31 * lresult + iStartExonId;
        lresult = 31 * lresult + iSeqEnd;
        lresult = 31 * lresult + iEndExonId;
        return lresult;
    }
}
