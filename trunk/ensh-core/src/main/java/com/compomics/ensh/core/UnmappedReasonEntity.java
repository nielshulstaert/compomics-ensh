package com.compomics.ensh.core;

/**
 * This class is a
 */
public class UnmappedReasonEntity {
    private short iUnmappedReasonId;

    public short getUnmappedReasonId() {
        return iUnmappedReasonId;
    }

    public void setUnmappedReasonId(short aUnmappedReasonId) {
        iUnmappedReasonId = aUnmappedReasonId;
    }

    private String iSummaryDescription;

    public String getSummaryDescription() {
        return iSummaryDescription;
    }

    public void setSummaryDescription(String aSummaryDescription) {
        iSummaryDescription = aSummaryDescription;
    }

    private String iFullDescription;

    public String getFullDescription() {
        return iFullDescription;
    }

    public void setFullDescription(String aFullDescription) {
        iFullDescription = aFullDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnmappedReasonEntity that = (UnmappedReasonEntity) o;

        if (iUnmappedReasonId != that.iUnmappedReasonId) return false;
        if (iFullDescription != null ? !iFullDescription.equals(that.iFullDescription) : that.iFullDescription != null)
            return false;
        if (iSummaryDescription != null ? !iSummaryDescription.equals(that.iSummaryDescription) : that.iSummaryDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = (int) iUnmappedReasonId;
        lresult = 31 * lresult + (iSummaryDescription != null ? iSummaryDescription.hashCode() : 0);
        lresult = 31 * lresult + (iFullDescription != null ? iFullDescription.hashCode() : 0);
        return lresult;
    }
}
