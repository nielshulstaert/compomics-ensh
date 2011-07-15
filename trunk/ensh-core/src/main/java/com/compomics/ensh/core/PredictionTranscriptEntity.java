package com.compomics.ensh.core;

/**
 * This class is a
 */
public class PredictionTranscriptEntity {
    private int iPredictionTranscriptId;

    public int getPredictionTranscriptId() {
        return iPredictionTranscriptId;
    }

    public void setPredictionTranscriptId(int aPredictionTranscriptId) {
        iPredictionTranscriptId = aPredictionTranscriptId;
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

    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
    }

    private String iDisplayLabel;

    public String getDisplayLabel() {
        return iDisplayLabel;
    }

    public void setDisplayLabel(String aDisplayLabel) {
        iDisplayLabel = aDisplayLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PredictionTranscriptEntity that = (PredictionTranscriptEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iPredictionTranscriptId != that.iPredictionTranscriptId) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;
        if (iDisplayLabel != null ? !iDisplayLabel.equals(that.iDisplayLabel) : that.iDisplayLabel != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iPredictionTranscriptId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (int) iSeqRegionStrand;
        lresult = 31 * lresult + (int) iAnalysisId;
        lresult = 31 * lresult + (iDisplayLabel != null ? iDisplayLabel.hashCode() : 0);
        return lresult;
    }
}
