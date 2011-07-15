package com.compomics.ensh.core;

/**
 * This class is a
 */
public class ExternalDbEntity {
    private short iExternalDbId;

    public short getExternalDbId() {
        return iExternalDbId;
    }

    public void setExternalDbId(short aExternalDbId) {
        iExternalDbId = aExternalDbId;
    }

    private String iDbName;

    public String getDbName() {
        return iDbName;
    }

    public void setDbName(String aDbName) {
        iDbName = aDbName;
    }

    private String iDbRelease;

    public String getDbRelease() {
        return iDbRelease;
    }

    public void setDbRelease(String aDbRelease) {
        iDbRelease = aDbRelease;
    }

    private String iStatus;

    public String getStatus() {
        return iStatus;
    }

    public void setStatus(String aStatus) {
        iStatus = aStatus;
    }

    private int iPriority;

    public int getPriority() {
        return iPriority;
    }

    public void setPriority(int aPriority) {
        iPriority = aPriority;
    }

    private String iDbDisplayName;

    public String getDbDisplayName() {
        return iDbDisplayName;
    }

    public void setDbDisplayName(String aDbDisplayName) {
        iDbDisplayName = aDbDisplayName;
    }

    private String iType;

    public String getType() {
        return iType;
    }

    public void setType(String aType) {
        iType = aType;
    }

    private String iSecondaryDbName;

    public String getSecondaryDbName() {
        return iSecondaryDbName;
    }

    public void setSecondaryDbName(String aSecondaryDbName) {
        iSecondaryDbName = aSecondaryDbName;
    }

    private String iSecondaryDbTable;

    public String getSecondaryDbTable() {
        return iSecondaryDbTable;
    }

    public void setSecondaryDbTable(String aSecondaryDbTable) {
        iSecondaryDbTable = aSecondaryDbTable;
    }

    private String iDescription;

    public String getDescription() {
        return iDescription;
    }

    public void setDescription(String aDescription) {
        iDescription = aDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExternalDbEntity that = (ExternalDbEntity) o;

        if (iExternalDbId != that.iExternalDbId) return false;
        if (iPriority != that.iPriority) return false;
        if (iDbDisplayName != null ? !iDbDisplayName.equals(that.iDbDisplayName) : that.iDbDisplayName != null)
            return false;
        if (iDbName != null ? !iDbName.equals(that.iDbName) : that.iDbName != null) return false;
        if (iDbRelease != null ? !iDbRelease.equals(that.iDbRelease) : that.iDbRelease != null) return false;
        if (iDescription != null ? !iDescription.equals(that.iDescription) : that.iDescription != null) return false;
        if (iSecondaryDbName != null ? !iSecondaryDbName.equals(that.iSecondaryDbName) : that.iSecondaryDbName != null)
            return false;
        if (iSecondaryDbTable != null ? !iSecondaryDbTable.equals(that.iSecondaryDbTable) : that.iSecondaryDbTable != null)
            return false;
        if (iStatus != null ? !iStatus.equals(that.iStatus) : that.iStatus != null) return false;
        if (iType != null ? !iType.equals(that.iType) : that.iType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = (int) iExternalDbId;
        lresult = 31 * lresult + (iDbName != null ? iDbName.hashCode() : 0);
        lresult = 31 * lresult + (iDbRelease != null ? iDbRelease.hashCode() : 0);
        lresult = 31 * lresult + (iStatus != null ? iStatus.hashCode() : 0);
        lresult = 31 * lresult + iPriority;
        lresult = 31 * lresult + (iDbDisplayName != null ? iDbDisplayName.hashCode() : 0);
        lresult = 31 * lresult + (iType != null ? iType.hashCode() : 0);
        lresult = 31 * lresult + (iSecondaryDbName != null ? iSecondaryDbName.hashCode() : 0);
        lresult = 31 * lresult + (iSecondaryDbTable != null ? iSecondaryDbTable.hashCode() : 0);
        lresult = 31 * lresult + (iDescription != null ? iDescription.hashCode() : 0);
        return lresult;
    }
}
