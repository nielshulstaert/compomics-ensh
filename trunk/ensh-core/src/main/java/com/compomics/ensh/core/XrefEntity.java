package com.compomics.ensh.core;

/**
 * This class is a
 */
public class XrefEntity {
    private int iXrefId;

    public int getXrefId() {
        return iXrefId;
    }

    public void setXrefId(int aXrefId) {
        iXrefId = aXrefId;
    }

    private short iExternalDbId;

    public short getExternalDbId() {
        return iExternalDbId;
    }

    public void setExternalDbId(short aExternalDbId) {
        iExternalDbId = aExternalDbId;
    }

    private String iDbprimaryAcc;

    public String getDbprimaryAcc() {
        return iDbprimaryAcc;
    }

    public void setDbprimaryAcc(String aDbprimaryAcc) {
        iDbprimaryAcc = aDbprimaryAcc;
    }

    private String iDisplayLabel;

    public String getDisplayLabel() {
        return iDisplayLabel;
    }

    public void setDisplayLabel(String aDisplayLabel) {
        iDisplayLabel = aDisplayLabel;
    }

    private String iVersion;

    public String getVersion() {
        return iVersion;
    }

    public void setVersion(String aVersion) {
        iVersion = aVersion;
    }

    private String iDescription;

    public String getDescription() {
        return iDescription;
    }

    public void setDescription(String aDescription) {
        iDescription = aDescription;
    }

    private String iInfoType;

    public String getInfoType() {
        return iInfoType;
    }

    public void setInfoType(String aInfoType) {
        iInfoType = aInfoType;
    }

    private String iInfoText;

    public String getInfoText() {
        return iInfoText;
    }

    public void setInfoText(String aInfoText) {
        iInfoText = aInfoText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XrefEntity that = (XrefEntity) o;

        if (iExternalDbId != that.iExternalDbId) return false;
        if (iXrefId != that.iXrefId) return false;
        if (iDbprimaryAcc != null ? !iDbprimaryAcc.equals(that.iDbprimaryAcc) : that.iDbprimaryAcc != null)
            return false;
        if (iDescription != null ? !iDescription.equals(that.iDescription) : that.iDescription != null) return false;
        if (iDisplayLabel != null ? !iDisplayLabel.equals(that.iDisplayLabel) : that.iDisplayLabel != null)
            return false;
        if (iInfoText != null ? !iInfoText.equals(that.iInfoText) : that.iInfoText != null) return false;
        if (iInfoType != null ? !iInfoType.equals(that.iInfoType) : that.iInfoType != null) return false;
        if (iVersion != null ? !iVersion.equals(that.iVersion) : that.iVersion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iXrefId;
        lresult = 31 * lresult + (int) iExternalDbId;
        lresult = 31 * lresult + (iDbprimaryAcc != null ? iDbprimaryAcc.hashCode() : 0);
        lresult = 31 * lresult + (iDisplayLabel != null ? iDisplayLabel.hashCode() : 0);
        lresult = 31 * lresult + (iVersion != null ? iVersion.hashCode() : 0);
        lresult = 31 * lresult + (iDescription != null ? iDescription.hashCode() : 0);
        lresult = 31 * lresult + (iInfoType != null ? iInfoType.hashCode() : 0);
        lresult = 31 * lresult + (iInfoText != null ? iInfoText.hashCode() : 0);
        return lresult;
    }
}
