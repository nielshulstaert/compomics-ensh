package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MarkerFeatureEntity {
    private int iMarkerFeatureId;

    public int getMarkerFeatureId() {
        return iMarkerFeatureId;
    }

    public void setMarkerFeatureId(int aMarkerFeatureId) {
        iMarkerFeatureId = aMarkerFeatureId;
    }

    private int iMarkerId;

    public int getMarkerId() {
        return iMarkerId;
    }

    public void setMarkerId(int aMarkerId) {
        iMarkerId = aMarkerId;
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

    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
    }

    private int iMapWeight;

    public int getMapWeight() {
        return iMapWeight;
    }

    public void setMapWeight(int aMapWeight) {
        iMapWeight = aMapWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarkerFeatureEntity that = (MarkerFeatureEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iMapWeight != that.iMapWeight) return false;
        if (iMarkerFeatureId != that.iMarkerFeatureId) return false;
        if (iMarkerId != that.iMarkerId) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMarkerFeatureId;
        lresult = 31 * lresult + iMarkerId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (int) iAnalysisId;
        lresult = 31 * lresult + iMapWeight;
        return lresult;
    }
}
