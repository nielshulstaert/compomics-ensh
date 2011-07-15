package com.compomics.ensh.core;

/**
 * This class is a
 */
public class ProteinAlignFeatureEntity {
    private int iProteinAlignFeatureId;

    public int getProteinAlignFeatureId() {
        return iProteinAlignFeatureId;
    }

    public void setProteinAlignFeatureId(int aProteinAlignFeatureId) {
        iProteinAlignFeatureId = aProteinAlignFeatureId;
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

    private int iHitStart;

    public int getHitStart() {
        return iHitStart;
    }

    public void setHitStart(int aHitStart) {
        iHitStart = aHitStart;
    }

    private int iHitEnd;

    public int getHitEnd() {
        return iHitEnd;
    }

    public void setHitEnd(int aHitEnd) {
        iHitEnd = aHitEnd;
    }

    private String iHitName;

    public String getHitName() {
        return iHitName;
    }

    public void setHitName(String aHitName) {
        iHitName = aHitName;
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

    private double iEvalue;

    public double getEvalue() {
        return iEvalue;
    }

    public void setEvalue(double aEvalue) {
        iEvalue = aEvalue;
    }

    private float iPercIdent;

    public float getPercIdent() {
        return iPercIdent;
    }

    public void setPercIdent(float aPercIdent) {
        iPercIdent = aPercIdent;
    }

    private String iCigarLine;

    public String getCigarLine() {
        return iCigarLine;
    }

    public void setCigarLine(String aCigarLine) {
        iCigarLine = aCigarLine;
    }

    private short iExternalDbId;

    public short getExternalDbId() {
        return iExternalDbId;
    }

    public void setExternalDbId(short aExternalDbId) {
        iExternalDbId = aExternalDbId;
    }

    private double iHcoverage;

    public double getHcoverage() {
        return iHcoverage;
    }

    public void setHcoverage(double aHcoverage) {
        iHcoverage = aHcoverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProteinAlignFeatureEntity that = (ProteinAlignFeatureEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (Double.compare(that.iEvalue, iEvalue) != 0) return false;
        if (iExternalDbId != that.iExternalDbId) return false;
        if (Double.compare(that.iHcoverage, iHcoverage) != 0) return false;
        if (iHitEnd != that.iHitEnd) return false;
        if (iHitStart != that.iHitStart) return false;
        if (Float.compare(that.iPercIdent, iPercIdent) != 0) return false;
        if (iProteinAlignFeatureId != that.iProteinAlignFeatureId) return false;
        if (Double.compare(that.iScore, iScore) != 0) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;
        if (iCigarLine != null ? !iCigarLine.equals(that.iCigarLine) : that.iCigarLine != null) return false;
        if (iHitName != null ? !iHitName.equals(that.iHitName) : that.iHitName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult;
        long temp;
        lresult = iProteinAlignFeatureId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (iSeqRegionStrand ? 1 : 0);
        lresult = 31 * lresult + iHitStart;
        lresult = 31 * lresult + iHitEnd;
        lresult = 31 * lresult + (iHitName != null ? iHitName.hashCode() : 0);
        lresult = 31 * lresult + (int) iAnalysisId;
        temp = iScore != +0.0d ? Double.doubleToLongBits(iScore) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        temp = iEvalue != +0.0d ? Double.doubleToLongBits(iEvalue) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        lresult = 31 * lresult + (iPercIdent != +0.0f ? Float.floatToIntBits(iPercIdent) : 0);
        lresult = 31 * lresult + (iCigarLine != null ? iCigarLine.hashCode() : 0);
        lresult = 31 * lresult + (int) iExternalDbId;
        temp = iHcoverage != +0.0d ? Double.doubleToLongBits(iHcoverage) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        return lresult;
    }
}
