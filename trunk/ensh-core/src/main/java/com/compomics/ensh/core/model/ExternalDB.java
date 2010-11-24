package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 12:26:39<br>
 */
public interface ExternalDB {
    String getName();

    void setName(String name);

    String getRelease();

    void setRelease(String release);

    String getStatus();

    void setStatus(String status);

    boolean isPrimaryAccessionLinkable();

    void setPrimaryAccessionLinkable(boolean primaryAccessionLinkable);

    boolean isDisplayLabelLinkable();

    void setDisplayLabelLinkable(boolean displayLabelLinkable);

    int getPriority();

    void setPriority(int priority);

    String getDisplayName();

    void setDisplayName(String displayName);

    String getType();

    void setType(String type);

    String getSecondaryDbName();

    void setSecondaryDbName(String secondaryDbName);

    String getSecondaryDbTable();

    void setSecondaryDbTable(String secondaryDbTable);
}
