package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.AnalysisDescription;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 27-Sep-2007<br>
 * Time: 17:42:37<br>
 */
public class AnalysisDescriptionImpl implements AnalysisDescription {

    private int id;
    private String description;
    private String displayLabel;
    private boolean displayable;
    private String webData;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getDescription() {
        if(description == null)
            return "";
        return description;
    }

    @Testable
    public void setDescription(String description) {
        this.description = description;
    }

    @Testable
    public String getDisplayLabel() {
         if(displayLabel == null)
            return "";
        return displayLabel;
    }

    @Testable
    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }

    @Testable
    public boolean isDisplayable() {
        return displayable;
    }

    @Testable
    public void setDisplayable(boolean displayable) {
        this.displayable = displayable;
    }

    @Testable
    public String getWebData() {
         if(webData == null)
            return "";
        return webData;
    }

    @Testable
    public void setWebData(String webData) {
        this.webData = webData;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof AnalysisDescription)) return false;

        AnalysisDescription that = (AnalysisDescription) o;

        if (displayable != that.isDisplayable()) return false;
        if (description != null ? !description.equals(that.getDescription()) : that.getDescription() != null) return false;
        if (displayLabel != null ? !displayLabel.equals(that.getDisplayLabel()) : that.getDisplayLabel() != null) return false;
        if (webData != null ? !webData.equals(that.getWebData()) : that.getWebData() != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (description != null ? description.hashCode() : 0);
        result = 31 * result + (displayLabel != null ? displayLabel.hashCode() : 0);
        result = 31 * result + (displayable ? 1 : 0);
        result = 31 * result + (webData != null ? webData.hashCode() : 0);
        return result;
    }
    
    public String toString() {
        return "AnalysisDescription{" +
                "description='" + description + '\'' +
                ", displayLabel='" + displayLabel + '\'' +
                ", displayable=" + displayable +
                ", webData='" + webData + '\'' +
                '}';
    }
}
