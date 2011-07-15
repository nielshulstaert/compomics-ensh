package com.compomics.ensh.core;

/**
 * This class is a
 */
public class UnconventionalTranscriptAssociationEntity {
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

    private String iInteractionType;

    public String getInteractionType() {
        return iInteractionType;
    }

    public void setInteractionType(String aInteractionType) {
        iInteractionType = aInteractionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnconventionalTranscriptAssociationEntity that = (UnconventionalTranscriptAssociationEntity) o;

        if (iGeneId != that.iGeneId) return false;
        if (iTranscriptId != that.iTranscriptId) return false;
        if (iInteractionType != null ? !iInteractionType.equals(that.iInteractionType) : that.iInteractionType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iTranscriptId;
        lresult = 31 * lresult + iGeneId;
        lresult = 31 * lresult + (iInteractionType != null ? iInteractionType.hashCode() : 0);
        return lresult;
    }
}
