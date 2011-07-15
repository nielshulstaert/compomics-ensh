package com.compomics.ensh.core;

/**
 * This class is a
 */
public class AnalysisDescriptionEntity {
    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
    }

    private String iDescription;

    public String getDescription() {
        return iDescription;
    }

    public void setDescription(String aDescription) {
        iDescription = aDescription;
    }

    private String iDisplayLabel;

    public String getDisplayLabel() {
        return iDisplayLabel;
    }

    public void setDisplayLabel(String aDisplayLabel) {
        iDisplayLabel = aDisplayLabel;
    }

    private boolean iDisplayable;

    public boolean isDisplayable() {
        return iDisplayable;
    }

    public void setDisplayable(boolean aDisplayable) {
        iDisplayable = aDisplayable;
    }

    private String iWebData;

    public String getWebData() {
        return iWebData;
    }

    public void setWebData(String aWebData) {
        iWebData = aWebData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnalysisDescriptionEntity that = (AnalysisDescriptionEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iDisplayable != that.iDisplayable) return false;
        if (iDescription != null ? !iDescription.equals(that.iDescription) : that.iDescription != null) return false;
        if (iDisplayLabel != null ? !iDisplayLabel.equals(that.iDisplayLabel) : that.iDisplayLabel != null)
            return false;
        if (iWebData != null ? !iWebData.equals(that.iWebData) : that.iWebData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = (int) iAnalysisId;
        lresult = 31 * lresult + (iDescription != null ? iDescription.hashCode() : 0);
        lresult = 31 * lresult + (iDisplayLabel != null ? iDisplayLabel.hashCode() : 0);
        lresult = 31 * lresult + (iDisplayable ? 1 : 0);
        lresult = 31 * lresult + (iWebData != null ? iWebData.hashCode() : 0);
        return lresult;
    }
}
