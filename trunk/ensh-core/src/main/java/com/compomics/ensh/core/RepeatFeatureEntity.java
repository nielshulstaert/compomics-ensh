package com.compomics.ensh.core;

/**
 * This class is a
 */
public class RepeatFeatureEntity {
    private int iRepeatFeatureId;

    public int getRepeatFeatureId() {
        return iRepeatFeatureId;
    }

    public void setRepeatFeatureId(int aRepeatFeatureId) {
        iRepeatFeatureId = aRepeatFeatureId;
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

    private boolean iSeqRegionStrand;

    public boolean isSeqRegionStrand() {
        return iSeqRegionStrand;
    }

    public void setSeqRegionStrand(boolean aSeqRegionStrand) {
        iSeqRegionStrand = aSeqRegionStrand;
    }

    private int iRepeatStart;

    public int getRepeatStart() {
        return iRepeatStart;
    }

    public void setRepeatStart(int aRepeatStart) {
        iRepeatStart = aRepeatStart;
    }

    private int iRepeatEnd;

    public int getRepeatEnd() {
        return iRepeatEnd;
    }

    public void setRepeatEnd(int aRepeatEnd) {
        iRepeatEnd = aRepeatEnd;
    }

    private int iRepeatConsensusId;

    public int getRepeatConsensusId() {
        return iRepeatConsensusId;
    }

    public void setRepeatConsensusId(int aRepeatConsensusId) {
        iRepeatConsensusId = aRepeatConsensusId;
    }

    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
    }

    private double iScore;

    public double getScore() {
        return iScore;
    }

    public void setScore(double aScore) {
        iScore = aScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepeatFeatureEntity that = (RepeatFeatureEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iRepeatConsensusId != that.iRepeatConsensusId) return false;
        if (iRepeatEnd != that.iRepeatEnd) return false;
        if (iRepeatFeatureId != that.iRepeatFeatureId) return false;
        if (iRepeatStart != that.iRepeatStart) return false;
        if (Double.compare(that.iScore, iScore) != 0) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult;
        long temp;
        lresult = iRepeatFeatureId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (iSeqRegionStrand ? 1 : 0);
        lresult = 31 * lresult + iRepeatStart;
        lresult = 31 * lresult + iRepeatEnd;
        lresult = 31 * lresult + iRepeatConsensusId;
        lresult = 31 * lresult + (int) iAnalysisId;
        temp = iScore != +0.0d ? Double.doubleToLongBits(iScore) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        return lresult;
    }
}
