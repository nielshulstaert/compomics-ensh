package com.compomics.ensh.core;

/**
 * This class is a
 */
public class SimpleFeatureEntity {
    private int iSimpleFeatureId;

    public int getSimpleFeatureId() {
        return iSimpleFeatureId;
    }

    public void setSimpleFeatureId(int aSimpleFeatureId) {
        iSimpleFeatureId = aSimpleFeatureId;
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

    private String iDisplayLabel;

    public String getDisplayLabel() {
        return iDisplayLabel;
    }

    public void setDisplayLabel(String aDisplayLabel) {
        iDisplayLabel = aDisplayLabel;
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

        SimpleFeatureEntity that = (SimpleFeatureEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (Double.compare(that.iScore, iScore) != 0) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;
        if (iSimpleFeatureId != that.iSimpleFeatureId) return false;
        if (iDisplayLabel != null ? !iDisplayLabel.equals(that.iDisplayLabel) : that.iDisplayLabel != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult;
        long temp;
        lresult = iSimpleFeatureId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (iSeqRegionStrand ? 1 : 0);
        lresult = 31 * lresult + (iDisplayLabel != null ? iDisplayLabel.hashCode() : 0);
        lresult = 31 * lresult + (int) iAnalysisId;
        temp = iScore != +0.0d ? Double.doubleToLongBits(iScore) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        return lresult;
    }
}
