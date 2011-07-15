package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MiscSetEntity {
    private short iMiscSetId;

    public short getMiscSetId() {
        return iMiscSetId;
    }

    public void setMiscSetId(short aMiscSetId) {
        iMiscSetId = aMiscSetId;
    }

    private String iCode;

    public String getCode() {
        return iCode;
    }

    public void setCode(String aCode) {
        iCode = aCode;
    }

    private String iName;

    public String getName() {
        return iName;
    }

    public void setName(String aName) {
        iName = aName;
    }

    private String iDescription;

    public String getDescription() {
        return iDescription;
    }

    public void setDescription(String aDescription) {
        iDescription = aDescription;
    }

    private int iMaxLength;

    public int getMaxLength() {
        return iMaxLength;
    }

    public void setMaxLength(int aMaxLength) {
        iMaxLength = aMaxLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MiscSetEntity that = (MiscSetEntity) o;

        if (iMaxLength != that.iMaxLength) return false;
        if (iMiscSetId != that.iMiscSetId) return false;
        if (iCode != null ? !iCode.equals(that.iCode) : that.iCode != null) return false;
        if (iDescription != null ? !iDescription.equals(that.iDescription) : that.iDescription != null) return false;
        if (iName != null ? !iName.equals(that.iName) : that.iName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = (int) iMiscSetId;
        lresult = 31 * lresult + (iCode != null ? iCode.hashCode() : 0);
        lresult = 31 * lresult + (iName != null ? iName.hashCode() : 0);
        lresult = 31 * lresult + (iDescription != null ? iDescription.hashCode() : 0);
        lresult = 31 * lresult + iMaxLength;
        return lresult;
    }
}
