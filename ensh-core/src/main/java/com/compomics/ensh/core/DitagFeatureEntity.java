package com.compomics.ensh.core;

/**
 * This class is a
 */
public class DitagFeatureEntity {
    private int iDitagFeatureId;

    public int getDitagFeatureId() {
        return iDitagFeatureId;
    }

    public void setDitagFeatureId(int aDitagFeatureId) {
        iDitagFeatureId = aDitagFeatureId;
    }

    private int iDitagId;

    public int getDitagId() {
        return iDitagId;
    }

    public void setDitagId(int aDitagId) {
        iDitagId = aDitagId;
    }

    private int iDitagPairId;

    public int getDitagPairId() {
        return iDitagPairId;
    }

    public void setDitagPairId(int aDitagPairId) {
        iDitagPairId = aDitagPairId;
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

    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
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

    private boolean iHitStrand;

    public boolean isHitStrand() {
        return iHitStrand;
    }

    public void setHitStrand(boolean aHitStrand) {
        iHitStrand = aHitStrand;
    }

    private String iCigarLine;

    public String getCigarLine() {
        return iCigarLine;
    }

    public void setCigarLine(String aCigarLine) {
        iCigarLine = aCigarLine;
    }

    private String iDitagSide;

    public String getDitagSide() {
        return iDitagSide;
    }

    public void setDitagSide(String aDitagSide) {
        iDitagSide = aDitagSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DitagFeatureEntity that = (DitagFeatureEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iDitagFeatureId != that.iDitagFeatureId) return false;
        if (iDitagId != that.iDitagId) return false;
        if (iDitagPairId != that.iDitagPairId) return false;
        if (iHitEnd != that.iHitEnd) return false;
        if (iHitStart != that.iHitStart) return false;
        if (iHitStrand != that.iHitStrand) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;
        if (iCigarLine != null ? !iCigarLine.equals(that.iCigarLine) : that.iCigarLine != null) return false;
        if (iDitagSide != null ? !iDitagSide.equals(that.iDitagSide) : that.iDitagSide != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iDitagFeatureId;
        lresult = 31 * lresult + iDitagId;
        lresult = 31 * lresult + iDitagPairId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (iSeqRegionStrand ? 1 : 0);
        lresult = 31 * lresult + (int) iAnalysisId;
        lresult = 31 * lresult + iHitStart;
        lresult = 31 * lresult + iHitEnd;
        lresult = 31 * lresult + (iHitStrand ? 1 : 0);
        lresult = 31 * lresult + (iCigarLine != null ? iCigarLine.hashCode() : 0);
        lresult = 31 * lresult + (iDitagSide != null ? iDitagSide.hashCode() : 0);
        return lresult;
    }
}
