package com.compomics.ensh.core;

/**
 * This class is a
 */
public class GeneArchiveEntity {
    private String iGeneStableId;

    public String getGeneStableId() {
        return iGeneStableId;
    }

    public void setGeneStableId(String aGeneStableId) {
        iGeneStableId = aGeneStableId;
    }

    private short iGeneVersion;

    public short getGeneVersion() {
        return iGeneVersion;
    }

    public void setGeneVersion(short aGeneVersion) {
        iGeneVersion = aGeneVersion;
    }

    private String iTranscriptStableId;

    public String getTranscriptStableId() {
        return iTranscriptStableId;
    }

    public void setTranscriptStableId(String aTranscriptStableId) {
        iTranscriptStableId = aTranscriptStableId;
    }

    private short iTranscriptVersion;

    public short getTranscriptVersion() {
        return iTranscriptVersion;
    }

    public void setTranscriptVersion(short aTranscriptVersion) {
        iTranscriptVersion = aTranscriptVersion;
    }

    private String iTranslationStableId;

    public String getTranslationStableId() {
        return iTranslationStableId;
    }

    public void setTranslationStableId(String aTranslationStableId) {
        iTranslationStableId = aTranslationStableId;
    }

    private short iTranslationVersion;

    public short getTranslationVersion() {
        return iTranslationVersion;
    }

    public void setTranslationVersion(short aTranslationVersion) {
        iTranslationVersion = aTranslationVersion;
    }

    private int iPeptideArchiveId;

    public int getPeptideArchiveId() {
        return iPeptideArchiveId;
    }

    public void setPeptideArchiveId(int aPeptideArchiveId) {
        iPeptideArchiveId = aPeptideArchiveId;
    }

    private int iMappingSessionId;

    public int getMappingSessionId() {
        return iMappingSessionId;
    }

    public void setMappingSessionId(int aMappingSessionId) {
        iMappingSessionId = aMappingSessionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneArchiveEntity that = (GeneArchiveEntity) o;

        if (iGeneVersion != that.iGeneVersion) return false;
        if (iMappingSessionId != that.iMappingSessionId) return false;
        if (iPeptideArchiveId != that.iPeptideArchiveId) return false;
        if (iTranscriptVersion != that.iTranscriptVersion) return false;
        if (iTranslationVersion != that.iTranslationVersion) return false;
        if (iGeneStableId != null ? !iGeneStableId.equals(that.iGeneStableId) : that.iGeneStableId != null)
            return false;
        if (iTranscriptStableId != null ? !iTranscriptStableId.equals(that.iTranscriptStableId) : that.iTranscriptStableId != null)
            return false;
        if (iTranslationStableId != null ? !iTranslationStableId.equals(that.iTranslationStableId) : that.iTranslationStableId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iGeneStableId != null ? iGeneStableId.hashCode() : 0;
        lresult = 31 * lresult + (int) iGeneVersion;
        lresult = 31 * lresult + (iTranscriptStableId != null ? iTranscriptStableId.hashCode() : 0);
        lresult = 31 * lresult + (int) iTranscriptVersion;
        lresult = 31 * lresult + (iTranslationStableId != null ? iTranslationStableId.hashCode() : 0);
        lresult = 31 * lresult + (int) iTranslationVersion;
        lresult = 31 * lresult + iPeptideArchiveId;
        lresult = 31 * lresult + iMappingSessionId;
        return lresult;
    }
}
