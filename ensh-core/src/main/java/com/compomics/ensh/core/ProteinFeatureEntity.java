package com.compomics.ensh.core;

/**
 * This class is a
 */
public class ProteinFeatureEntity {
    private int iProteinFeatureId;

    public int getProteinFeatureId() {
        return iProteinFeatureId;
    }

    public void setProteinFeatureId(int aProteinFeatureId) {
        iProteinFeatureId = aProteinFeatureId;
    }

    private int iTranslationId;

    public int getTranslationId() {
        return iTranslationId;
    }

    public void setTranslationId(int aTranslationId) {
        iTranslationId = aTranslationId;
    }

    private int iSeqStart;

    public int getSeqStart() {
        return iSeqStart;
    }

    public void setSeqStart(int aSeqStart) {
        iSeqStart = aSeqStart;
    }

    private int iSeqEnd;

    public int getSeqEnd() {
        return iSeqEnd;
    }

    public void setSeqEnd(int aSeqEnd) {
        iSeqEnd = aSeqEnd;
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

    private String iExternalData;

    public String getExternalData() {
        return iExternalData;
    }

    public void setExternalData(String aExternalData) {
        iExternalData = aExternalData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProteinFeatureEntity that = (ProteinFeatureEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (Double.compare(that.iEvalue, iEvalue) != 0) return false;
        if (iHitEnd != that.iHitEnd) return false;
        if (iHitStart != that.iHitStart) return false;
        if (Float.compare(that.iPercIdent, iPercIdent) != 0) return false;
        if (iProteinFeatureId != that.iProteinFeatureId) return false;
        if (Double.compare(that.iScore, iScore) != 0) return false;
        if (iSeqEnd != that.iSeqEnd) return false;
        if (iSeqStart != that.iSeqStart) return false;
        if (iTranslationId != that.iTranslationId) return false;
        if (iExternalData != null ? !iExternalData.equals(that.iExternalData) : that.iExternalData != null)
            return false;
        if (iHitName != null ? !iHitName.equals(that.iHitName) : that.iHitName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult;
        long temp;
        lresult = iProteinFeatureId;
        lresult = 31 * lresult + iTranslationId;
        lresult = 31 * lresult + iSeqStart;
        lresult = 31 * lresult + iSeqEnd;
        lresult = 31 * lresult + iHitStart;
        lresult = 31 * lresult + iHitEnd;
        lresult = 31 * lresult + (iHitName != null ? iHitName.hashCode() : 0);
        lresult = 31 * lresult + (int) iAnalysisId;
        temp = iScore != +0.0d ? Double.doubleToLongBits(iScore) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        temp = iEvalue != +0.0d ? Double.doubleToLongBits(iEvalue) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        lresult = 31 * lresult + (iPercIdent != +0.0f ? Float.floatToIntBits(iPercIdent) : 0);
        lresult = 31 * lresult + (iExternalData != null ? iExternalData.hashCode() : 0);
        return lresult;
    }
}
