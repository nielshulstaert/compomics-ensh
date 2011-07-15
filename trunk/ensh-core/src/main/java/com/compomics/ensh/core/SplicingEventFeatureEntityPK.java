package com.compomics.ensh.core;

import java.io.Serializable;

/**
 * This class is a
 */
public class SplicingEventFeatureEntityPK implements Serializable {
    private int iSplicingEventFeatureId;

    public int getSplicingEventFeatureId() {
        return iSplicingEventFeatureId;
    }

    public void setSplicingEventFeatureId(int aSplicingEventFeatureId) {
        iSplicingEventFeatureId = aSplicingEventFeatureId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SplicingEventFeatureEntityPK that = (SplicingEventFeatureEntityPK) o;

        if (iExonId != that.iExonId) return false;
        if (iSplicingEventFeatureId != that.iSplicingEventFeatureId) return false;
        if (iTranscriptId != that.iTranscriptId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iSplicingEventFeatureId;
        lresult = 31 * lresult + iExonId;
        lresult = 31 * lresult + iTranscriptId;
        return lresult;
    }
}
