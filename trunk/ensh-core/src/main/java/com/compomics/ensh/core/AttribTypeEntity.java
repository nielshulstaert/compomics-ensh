package com.compomics.ensh.core;

/**
 * This class is a
 */
public class AttribTypeEntity {
    private short iAttribTypeId;

    public short getAttribTypeId() {
        return iAttribTypeId;
    }

    public void setAttribTypeId(short aAttribTypeId) {
        iAttribTypeId = aAttribTypeId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttribTypeEntity that = (AttribTypeEntity) o;

        if (iAttribTypeId != that.iAttribTypeId) return false;
        if (iCode != null ? !iCode.equals(that.iCode) : that.iCode != null) return false;
        if (iDescription != null ? !iDescription.equals(that.iDescription) : that.iDescription != null) return false;
        if (iName != null ? !iName.equals(that.iName) : that.iName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = (int) iAttribTypeId;
        lresult = 31 * lresult + (iCode != null ? iCode.hashCode() : 0);
        lresult = 31 * lresult + (iName != null ? iName.hashCode() : 0);
        lresult = 31 * lresult + (iDescription != null ? iDescription.hashCode() : 0);
        return lresult;
    }
}
