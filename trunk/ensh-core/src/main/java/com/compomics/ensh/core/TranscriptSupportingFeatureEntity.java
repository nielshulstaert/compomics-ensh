package com.compomics.ensh.core;

/**
 * This class is a
 */
public class TranscriptSupportingFeatureEntity {
    private int iTranscriptId;

    public int getTranscriptId() {
        return iTranscriptId;
    }

    public void setTranscriptId(int aTranscriptId) {
        iTranscriptId = aTranscriptId;
    }

    private String iFeatureType;

    public String getFeatureType() {
        return iFeatureType;
    }

    public void setFeatureType(String aFeatureType) {
        iFeatureType = aFeatureType;
    }

    private int iFeatureId;

    public int getFeatureId() {
        return iFeatureId;
    }

    public void setFeatureId(int aFeatureId) {
        iFeatureId = aFeatureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TranscriptSupportingFeatureEntity that = (TranscriptSupportingFeatureEntity) o;

        if (iFeatureId != that.iFeatureId) return false;
        if (iTranscriptId != that.iTranscriptId) return false;
        if (iFeatureType != null ? !iFeatureType.equals(that.iFeatureType) : that.iFeatureType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iTranscriptId;
        lresult = 31 * lresult + (iFeatureType != null ? iFeatureType.hashCode() : 0);
        lresult = 31 * lresult + iFeatureId;
        return lresult;
    }
}
