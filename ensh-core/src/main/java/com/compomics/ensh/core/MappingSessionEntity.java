package com.compomics.ensh.core;

import java.sql.Timestamp;

/**
 * This class is a
 */
public class MappingSessionEntity {
    private int iMappingSessionId;

    public int getMappingSessionId() {
        return iMappingSessionId;
    }

    public void setMappingSessionId(int aMappingSessionId) {
        iMappingSessionId = aMappingSessionId;
    }

    private String iOldDbName;

    public String getOldDbName() {
        return iOldDbName;
    }

    public void setOldDbName(String aOldDbName) {
        iOldDbName = aOldDbName;
    }

    private String iNewDbName;

    public String getNewDbName() {
        return iNewDbName;
    }

    public void setNewDbName(String aNewDbName) {
        iNewDbName = aNewDbName;
    }

    private String iOldRelease;

    public String getOldRelease() {
        return iOldRelease;
    }

    public void setOldRelease(String aOldRelease) {
        iOldRelease = aOldRelease;
    }

    private String iNewRelease;

    public String getNewRelease() {
        return iNewRelease;
    }

    public void setNewRelease(String aNewRelease) {
        iNewRelease = aNewRelease;
    }

    private String iOldAssembly;

    public String getOldAssembly() {
        return iOldAssembly;
    }

    public void setOldAssembly(String aOldAssembly) {
        iOldAssembly = aOldAssembly;
    }

    private String iNewAssembly;

    public String getNewAssembly() {
        return iNewAssembly;
    }

    public void setNewAssembly(String aNewAssembly) {
        iNewAssembly = aNewAssembly;
    }

    private Timestamp iCreated;

    public Timestamp getCreated() {
        return iCreated;
    }

    public void setCreated(Timestamp aCreated) {
        iCreated = aCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MappingSessionEntity that = (MappingSessionEntity) o;

        if (iMappingSessionId != that.iMappingSessionId) return false;
        if (iCreated != null ? !iCreated.equals(that.iCreated) : that.iCreated != null) return false;
        if (iNewAssembly != null ? !iNewAssembly.equals(that.iNewAssembly) : that.iNewAssembly != null) return false;
        if (iNewDbName != null ? !iNewDbName.equals(that.iNewDbName) : that.iNewDbName != null) return false;
        if (iNewRelease != null ? !iNewRelease.equals(that.iNewRelease) : that.iNewRelease != null) return false;
        if (iOldAssembly != null ? !iOldAssembly.equals(that.iOldAssembly) : that.iOldAssembly != null) return false;
        if (iOldDbName != null ? !iOldDbName.equals(that.iOldDbName) : that.iOldDbName != null) return false;
        if (iOldRelease != null ? !iOldRelease.equals(that.iOldRelease) : that.iOldRelease != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMappingSessionId;
        lresult = 31 * lresult + (iOldDbName != null ? iOldDbName.hashCode() : 0);
        lresult = 31 * lresult + (iNewDbName != null ? iNewDbName.hashCode() : 0);
        lresult = 31 * lresult + (iOldRelease != null ? iOldRelease.hashCode() : 0);
        lresult = 31 * lresult + (iNewRelease != null ? iNewRelease.hashCode() : 0);
        lresult = 31 * lresult + (iOldAssembly != null ? iOldAssembly.hashCode() : 0);
        lresult = 31 * lresult + (iNewAssembly != null ? iNewAssembly.hashCode() : 0);
        lresult = 31 * lresult + (iCreated != null ? iCreated.hashCode() : 0);
        return lresult;
    }
}
