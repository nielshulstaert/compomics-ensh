package com.compomics.ensh.core;

/**
 * This class is a
 */
public class QtlFeatureEntity {
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

    private int iQtlId;

    public int getQtlId() {
        return iQtlId;
    }

    public void setQtlId(int aQtlId) {
        iQtlId = aQtlId;
    }

    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QtlFeatureEntity that = (QtlFeatureEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iQtlId != that.iQtlId) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + iQtlId;
        lresult = 31 * lresult + (int) iAnalysisId;
        return lresult;
    }
}
