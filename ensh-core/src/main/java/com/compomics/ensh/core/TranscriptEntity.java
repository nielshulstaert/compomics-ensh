package com.compomics.ensh.core;

/**
 * This class is a
 */
public class TranscriptEntity {
    private int iTranscriptId;

    public int getTranscriptId() {
        return iTranscriptId;
    }

    public void setTranscriptId(int aTranscriptId) {
        iTranscriptId = aTranscriptId;
    }

    private int iGeneId;

    public int getGeneId() {
        return iGeneId;
    }

    public void setGeneId(int aGeneId) {
        iGeneId = aGeneId;
    }

    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
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

    private byte iSeqRegionStrand;

    public byte getSeqRegionStrand() {
        return iSeqRegionStrand;
    }

    public void setSeqRegionStrand(byte aSeqRegionStrand) {
        iSeqRegionStrand = aSeqRegionStrand;
    }

    private int iDisplayXrefId;

    public int getDisplayXrefId() {
        return iDisplayXrefId;
    }

    public void setDisplayXrefId(int aDisplayXrefId) {
        iDisplayXrefId = aDisplayXrefId;
    }

    private String iBiotype;

    public String getBiotype() {
        return iBiotype;
    }

    public void setBiotype(String aBiotype) {
        iBiotype = aBiotype;
    }

    private String iStatus;

    public String getStatus() {
        return iStatus;
    }

    public void setStatus(String aStatus) {
        iStatus = aStatus;
    }

    private String iDescription;

    public String getDescription() {
        return iDescription;
    }

    public void setDescription(String aDescription) {
        iDescription = aDescription;
    }

    private boolean iIsCurrent;

    public boolean isIsCurrent() {
        return iIsCurrent;
    }

    public void setIsCurrent(boolean aIsCurrent) {
        iIsCurrent = aIsCurrent;
    }

    private int iCanonicalTranslationId;

    public int getCanonicalTranslationId() {
        return iCanonicalTranslationId;
    }

    public void setCanonicalTranslationId(int aCanonicalTranslationId) {
        iCanonicalTranslationId = aCanonicalTranslationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TranscriptEntity that = (TranscriptEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iCanonicalTranslationId != that.iCanonicalTranslationId) return false;
        if (iDisplayXrefId != that.iDisplayXrefId) return false;
        if (iGeneId != that.iGeneId) return false;
        if (iIsCurrent != that.iIsCurrent) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;
        if (iTranscriptId != that.iTranscriptId) return false;
        if (iBiotype != null ? !iBiotype.equals(that.iBiotype) : that.iBiotype != null) return false;
        if (iDescription != null ? !iDescription.equals(that.iDescription) : that.iDescription != null) return false;
        if (iStatus != null ? !iStatus.equals(that.iStatus) : that.iStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iTranscriptId;
        lresult = 31 * lresult + iGeneId;
        lresult = 31 * lresult + (int) iAnalysisId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (int) iSeqRegionStrand;
        lresult = 31 * lresult + iDisplayXrefId;
        lresult = 31 * lresult + (iBiotype != null ? iBiotype.hashCode() : 0);
        lresult = 31 * lresult + (iStatus != null ? iStatus.hashCode() : 0);
        lresult = 31 * lresult + (iDescription != null ? iDescription.hashCode() : 0);
        lresult = 31 * lresult + (iIsCurrent ? 1 : 0);
        lresult = 31 * lresult + iCanonicalTranslationId;
        return lresult;
    }
}
