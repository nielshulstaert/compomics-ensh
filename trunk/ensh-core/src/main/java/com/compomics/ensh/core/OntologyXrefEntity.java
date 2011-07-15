package com.compomics.ensh.core;

/**
 * This class is a
 */
public class OntologyXrefEntity {
    private int iObjectXrefId;

    public int getObjectXrefId() {
        return iObjectXrefId;
    }

    public void setObjectXrefId(int aObjectXrefId) {
        iObjectXrefId = aObjectXrefId;
    }

    private int iSourceXrefId;

    public int getSourceXrefId() {
        return iSourceXrefId;
    }

    public void setSourceXrefId(int aSourceXrefId) {
        iSourceXrefId = aSourceXrefId;
    }

    private String iLinkageType;

    public String getLinkageType() {
        return iLinkageType;
    }

    public void setLinkageType(String aLinkageType) {
        iLinkageType = aLinkageType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OntologyXrefEntity that = (OntologyXrefEntity) o;

        if (iObjectXrefId != that.iObjectXrefId) return false;
        if (iSourceXrefId != that.iSourceXrefId) return false;
        if (iLinkageType != null ? !iLinkageType.equals(that.iLinkageType) : that.iLinkageType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iObjectXrefId;
        lresult = 31 * lresult + iSourceXrefId;
        lresult = 31 * lresult + (iLinkageType != null ? iLinkageType.hashCode() : 0);
        return lresult;
    }
}
