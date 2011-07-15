package com.compomics.ensh.core;

/**
 * This class is a
 */
public class DependentXrefEntity {
    private int iObjectXrefId;

    public int getObjectXrefId() {
        return iObjectXrefId;
    }

    public void setObjectXrefId(int aObjectXrefId) {
        iObjectXrefId = aObjectXrefId;
    }

    private int iMasterXrefId;

    public int getMasterXrefId() {
        return iMasterXrefId;
    }

    public void setMasterXrefId(int aMasterXrefId) {
        iMasterXrefId = aMasterXrefId;
    }

    private int iDependentXrefId;

    public int getDependentXrefId() {
        return iDependentXrefId;
    }

    public void setDependentXrefId(int aDependentXrefId) {
        iDependentXrefId = aDependentXrefId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DependentXrefEntity that = (DependentXrefEntity) o;

        if (iDependentXrefId != that.iDependentXrefId) return false;
        if (iMasterXrefId != that.iMasterXrefId) return false;
        if (iObjectXrefId != that.iObjectXrefId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iObjectXrefId;
        lresult = 31 * lresult + iMasterXrefId;
        lresult = 31 * lresult + iDependentXrefId;
        return lresult;
    }
}
