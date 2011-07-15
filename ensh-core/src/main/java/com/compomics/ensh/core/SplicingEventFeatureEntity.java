package com.compomics.ensh.core;

/**
 * This class is a
 */
public class SplicingEventFeatureEntity {
    private int iSplicingEventFeatureId;

    public int getSplicingEventFeatureId() {
        return iSplicingEventFeatureId;
    }

    public void setSplicingEventFeatureId(int aSplicingEventFeatureId) {
        iSplicingEventFeatureId = aSplicingEventFeatureId;
    }

    private int iSplicingEventId;

    public int getSplicingEventId() {
        return iSplicingEventId;
    }

    public void setSplicingEventId(int aSplicingEventId) {
        iSplicingEventId = aSplicingEventId;
    }

    private int iExonId;

    public int getExonId() {
        return iExonId;
    }

    public void setExonId(int aExonId) {
        iExonId = aExonId;
    }

    private int iTranscriptId;

    public int getTranscriptId() {
        return iTranscriptId;
    }

    public void setTranscriptId(int aTranscriptId) {
        iTranscriptId = aTranscriptId;
    }

    private int iFeatureOrder;

    public int getFeatureOrder() {
        return iFeatureOrder;
    }

    public void setFeatureOrder(int aFeatureOrder) {
        iFeatureOrder = aFeatureOrder;
    }

    private int iTranscriptAssociation;

    public int getTranscriptAssociation() {
        return iTranscriptAssociation;
    }

    public void setTranscriptAssociation(int aTranscriptAssociation) {
        iTranscriptAssociation = aTranscriptAssociation;
    }

    private String iType;

    public String getType() {
        return iType;
    }

    public void setType(String aType) {
        iType = aType;
    }

    private int iStart;

    public int getStart() {
        return iStart;
    }

    public void setStart(int aStart) {
        iStart = aStart;
    }

    private int iEnd;

    public int getEnd() {
        return iEnd;
    }

    public void setEnd(int aEnd) {
        iEnd = aEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SplicingEventFeatureEntity that = (SplicingEventFeatureEntity) o;

        if (iEnd != that.iEnd) return false;
        if (iExonId != that.iExonId) return false;
        if (iFeatureOrder != that.iFeatureOrder) return false;
        if (iSplicingEventFeatureId != that.iSplicingEventFeatureId) return false;
        if (iSplicingEventId != that.iSplicingEventId) return false;
        if (iStart != that.iStart) return false;
        if (iTranscriptAssociation != that.iTranscriptAssociation) return false;
        if (iTranscriptId != that.iTranscriptId) return false;
        if (iType != null ? !iType.equals(that.iType) : that.iType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iSplicingEventFeatureId;
        lresult = 31 * lresult + iSplicingEventId;
        lresult = 31 * lresult + iExonId;
        lresult = 31 * lresult + iTranscriptId;
        lresult = 31 * lresult + iFeatureOrder;
        lresult = 31 * lresult + iTranscriptAssociation;
        lresult = 31 * lresult + (iType != null ? iType.hashCode() : 0);
        lresult = 31 * lresult + iStart;
        lresult = 31 * lresult + iEnd;
        return lresult;
    }
}
