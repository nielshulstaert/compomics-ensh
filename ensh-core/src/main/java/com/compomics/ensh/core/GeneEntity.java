package com.compomics.ensh.core;

/**
 * This class is a
 */
public class GeneEntity {
    private int iGeneId;

    public int getGeneId() {
        return iGeneId;
    }

    public void setGeneId(int aGeneId) {
        iGeneId = aGeneId;
    }

    private String iBiotype;

    public String getBiotype() {
        return iBiotype;
    }

    public void setBiotype(String aBiotype) {
        iBiotype = aBiotype;
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

    private String iSource;

    public String getSource() {
        return iSource;
    }

    public void setSource(String aSource) {
        iSource = aSource;
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

    private int iCanonicalTranscriptId;

    public int getCanonicalTranscriptId() {
        return iCanonicalTranscriptId;
    }

    public void setCanonicalTranscriptId(int aCanonicalTranscriptId) {
        iCanonicalTranscriptId = aCanonicalTranscriptId;
    }

    private String iCanonicalAnnotation;

    public String getCanonicalAnnotation() {
        return iCanonicalAnnotation;
    }

    public void setCanonicalAnnotation(String aCanonicalAnnotation) {
        iCanonicalAnnotation = aCanonicalAnnotation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneEntity that = (GeneEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iCanonicalTranscriptId != that.iCanonicalTranscriptId) return false;
        if (iDisplayXrefId != that.iDisplayXrefId) return false;
        if (iGeneId != that.iGeneId) return false;
        if (iIsCurrent != that.iIsCurrent) return false;
        if (iSeqRegionEnd != that.iSeqRegionEnd) return false;
        if (iSeqRegionId != that.iSeqRegionId) return false;
        if (iSeqRegionStart != that.iSeqRegionStart) return false;
        if (iSeqRegionStrand != that.iSeqRegionStrand) return false;
        if (iBiotype != null ? !iBiotype.equals(that.iBiotype) : that.iBiotype != null) return false;
        if (iCanonicalAnnotation != null ? !iCanonicalAnnotation.equals(that.iCanonicalAnnotation) : that.iCanonicalAnnotation != null)
            return false;
        if (iDescription != null ? !iDescription.equals(that.iDescription) : that.iDescription != null) return false;
        if (iSource != null ? !iSource.equals(that.iSource) : that.iSource != null) return false;
        if (iStatus != null ? !iStatus.equals(that.iStatus) : that.iStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iGeneId;
        lresult = 31 * lresult + (iBiotype != null ? iBiotype.hashCode() : 0);
        lresult = 31 * lresult + (int) iAnalysisId;
        lresult = 31 * lresult + iSeqRegionId;
        lresult = 31 * lresult + iSeqRegionStart;
        lresult = 31 * lresult + iSeqRegionEnd;
        lresult = 31 * lresult + (int) iSeqRegionStrand;
        lresult = 31 * lresult + iDisplayXrefId;
        lresult = 31 * lresult + (iSource != null ? iSource.hashCode() : 0);
        lresult = 31 * lresult + (iStatus != null ? iStatus.hashCode() : 0);
        lresult = 31 * lresult + (iDescription != null ? iDescription.hashCode() : 0);
        lresult = 31 * lresult + (iIsCurrent ? 1 : 0);
        lresult = 31 * lresult + iCanonicalTranscriptId;
        lresult = 31 * lresult + (iCanonicalAnnotation != null ? iCanonicalAnnotation.hashCode() : 0);
        return lresult;
    }
}
