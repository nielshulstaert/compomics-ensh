package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.StableID;

import java.util.Date;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 17:53:46<br>
 */
public class StableIDImpl implements StableID {

    private int ensemblObjectId;
    private String stableId;
    private Integer version;
    private Date createdDate;
    private Date modifiedDate;

    @Testable
    public int getEnsemblObjectId() {
        return ensemblObjectId;
    }

    @Testable
    public void setEnsemblObjectId(int ensemblObjectId) {
        this.ensemblObjectId = ensemblObjectId;
    }

    @Testable
    public String getStableId() {
        return stableId;
    }

    @Testable
    public void setStableId(String stableId) {
        this.stableId = stableId;
    }

    @Testable
    public int getVersion() {
        return version;
    }

    @Testable
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Testable
    public Date getCreatedDate() {
        return createdDate;
    }

    @Testable
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Testable
    public Date getModifiedDate() {
        return modifiedDate;
    }

    @Testable
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof StableID)) return false;

        StableID stableID = (StableID) o;

        if (!stableId.equals(stableID.getStableId())) return false;
        if (!version.equals(stableID.getVersion())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = stableId.hashCode();
        result = 31 * result + version.hashCode();
        return result;
    }

    @Testable
    public int compareTo(StableID that) {

        if (this == that) return 0;

        if (!this.getStableId().equals(that.getStableId())) return this.getStableId().compareTo(that.getStableId());
        return new Integer(this.getVersion()).compareTo(that.getVersion());

    }

    public String toString() {
        return stableId + '.' + version;
    }

}
