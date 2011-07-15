package com.compomics.ensh.core;

import java.sql.Timestamp;

/**
 * This class is a
 */
public class TranscriptStableIdEntity {
    private int iTranscriptId;

    public int getTranscriptId() {
        return iTranscriptId;
    }

    public void setTranscriptId(int aTranscriptId) {
        iTranscriptId = aTranscriptId;
    }

    private String iStableId;

    public String getStableId() {
        return iStableId;
    }

    public void setStableId(String aStableId) {
        iStableId = aStableId;
    }

    private int iVersion;

    public int getVersion() {
        return iVersion;
    }

    public void setVersion(int aVersion) {
        iVersion = aVersion;
    }

    private Timestamp iCreatedDate;

    public Timestamp getCreatedDate() {
        return iCreatedDate;
    }

    public void setCreatedDate(Timestamp aCreatedDate) {
        iCreatedDate = aCreatedDate;
    }

    private Timestamp iModifiedDate;

    public Timestamp getModifiedDate() {
        return iModifiedDate;
    }

    public void setModifiedDate(Timestamp aModifiedDate) {
        iModifiedDate = aModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TranscriptStableIdEntity that = (TranscriptStableIdEntity) o;

        if (iTranscriptId != that.iTranscriptId) return false;
        if (iVersion != that.iVersion) return false;
        if (iCreatedDate != null ? !iCreatedDate.equals(that.iCreatedDate) : that.iCreatedDate != null) return false;
        if (iModifiedDate != null ? !iModifiedDate.equals(that.iModifiedDate) : that.iModifiedDate != null)
            return false;
        if (iStableId != null ? !iStableId.equals(that.iStableId) : that.iStableId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iTranscriptId;
        lresult = 31 * lresult + (iStableId != null ? iStableId.hashCode() : 0);
        lresult = 31 * lresult + iVersion;
        lresult = 31 * lresult + (iCreatedDate != null ? iCreatedDate.hashCode() : 0);
        lresult = 31 * lresult + (iModifiedDate != null ? iModifiedDate.hashCode() : 0);
        return lresult;
    }
}
