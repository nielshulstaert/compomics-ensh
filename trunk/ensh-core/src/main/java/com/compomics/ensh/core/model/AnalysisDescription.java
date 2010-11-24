package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 13:41:59<br>
 */
public interface AnalysisDescription {
    int getId();

    void setId(int id);

    String getDescription();

    void setDescription(String description);

    String getDisplayLabel();

    void setDisplayLabel(String displayLabel);

    boolean isDisplayable();

    void setDisplayable(boolean displayable);

    String getWebData();

    void setWebData(String webData);
}
