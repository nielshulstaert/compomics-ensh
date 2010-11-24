package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.ExternalDB;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 12:28:16<br>
 */
public class ExternalDBImpl implements ExternalDB {

    private int id;
    private String name;
    private String release;
    private String status;
    private boolean primaryAccessionLinkable;
    private boolean displayLabelLinkable;
    private int priority;
    private String displayName;
    private String type;
    private String secondaryDbName;
    private String secondaryDbTable;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getName() {
        return name;
    }

    @Testable
    public void setName(String name) {
        this.name = name;
    }

    @Testable
    public String getRelease() {
        return release;
    }

    @Testable
    public void setRelease(String release) {
        this.release = release;
    }

    @Testable
    public String getStatus() {
        return status;
    }

    @Testable
    public void setStatus(String status) {
        this.status = status;
    }

    @Testable
    public boolean isPrimaryAccessionLinkable() {
        return primaryAccessionLinkable;
    }

    @Testable
    public void setPrimaryAccessionLinkable(boolean primaryAccessionLinkable) {
        this.primaryAccessionLinkable = primaryAccessionLinkable;
    }

    @Testable
    public boolean isDisplayLabelLinkable() {
        return displayLabelLinkable;
    }

    @Testable
    public void setDisplayLabelLinkable(boolean displayLabelLinkable) {
        this.displayLabelLinkable = displayLabelLinkable;
    }

    @Testable
    public int getPriority() {
        return priority;
    }

    @Testable
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Testable
    public String getDisplayName() {
        return displayName;
    }

    @Testable
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Testable
    public String getType() {
        return type;
    }

    @Testable
    public void setType(String type) {
        this.type = type;
    }

    @Testable
    public String getSecondaryDbName() {
        return secondaryDbName;
    }

    @Testable
    public void setSecondaryDbName(String secondaryDbName) {
        this.secondaryDbName = secondaryDbName;
    }

    @Testable
    public String getSecondaryDbTable() {
        return secondaryDbTable;
    }

    @Testable
    public void setSecondaryDbTable(String secondaryDbTable) {
        this.secondaryDbTable = secondaryDbTable;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof ExternalDB)) return false;

        ExternalDB that = (ExternalDB) o;

        if (!name.equals(that.getName())) return false;
        if (!release.equals(that.getRelease())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = name.hashCode();
        result = 31 * result + release.hashCode();
        return result;
    }

    @Testable



    public String toString() {
        return "ExternalDB{" +
                "name='" + name + '\'' +
                ", release=" + release +
                '}';
    }
}
