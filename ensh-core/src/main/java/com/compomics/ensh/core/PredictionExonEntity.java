package com.compomics.ensh.core;

/**
 * This class is a
 */
public class PredictionExonEntity {
    private int iPredictionExonId;
    private double iPvalue;

    public double getPvalue() {
        return iPvalue;
    }

    public void setPvalue(double aPvalue) {
        iPvalue = aPvalue;
    }

    public int getPredictionExonId() {
        return iPredictionExonId;
    }

    public void setPredictionExonId(int aPredictionExonId) {
        iPredictionExonId = aPredictionExonId;
    }

    private int iPredictionTranscriptId;

    public int getPredictionTranscriptId() {
        return iPredictionTranscriptId;
    }

    public void setPredictionTranscriptId(int aPredictionTranscriptId) {
        iPredictionTranscriptId = aPredictionTranscriptId;
    }

    private short iExonRank;

    public short getExonRank() {
        return iExonRank;
    }

    public void setExonRank(short aExonRank) {
        iExonRank = aExonRank;
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

    private byte iStartPhase;

    public byte getStartPhase() {
        return iStartPhase;
    }

    public void setStartPhase(byte aStartPhase) {
        iStartPhase = aStartPhase;
    }

    private double iScore;

    public double getScore() {
        return iScore;
    }

    public void setScore(double aScore) {
        iScore = aScore;
    }

    private double iPValue;

    public double getPValue() {
        return iPValue;
    }

    public void setPValue(double aPValue) {
        iPValue = aPValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PredictionExonEntity that = (PredictionExonEntity) o;

        if (iExonRank != that.iExonRank) return false;
        if (iPredictionExonId != that.iPredictionExonId) return false;
        if (iPredictionTranscriptId != that.iPredictionTranscriptId) return false;
        if (Double.compare(that.iScore, iScore) != 0) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;
        if (iStartPhase != that.iStartPhase) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult;
        long temp;
        lresult = iPredictionExonId;
        lresult = 31 * lresult + iPredictionTranscriptId;
        lresult = 31 * lresult + (int) iExonRank;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (int) iSeqRegionStrand;
        lresult = 31 * lresult + (int) iStartPhase;
        temp = iScore != +0.0d ? Double.doubleToLongBits(iScore) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        return lresult;
    }
}
