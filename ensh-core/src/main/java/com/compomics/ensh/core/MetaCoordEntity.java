package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MetaCoordEntity {
    private String iTableName;

    public String getTableName() {
        return iTableName;
    }

    public void setTableName(String aTableName) {
        iTableName = aTableName;
    }

    private int iCoordSystemId;

    public int getCoordSystemId() {
        return iCoordSystemId;
    }

    public void setCoordSystemId(int aCoordSystemId) {
        iCoordSystemId = aCoordSystemId;
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

        MetaCoordEntity that = (MetaCoordEntity) o;

        if (iCoordSystemId != that.iCoordSystemId) return false;
        if (iMaxLength != that.iMaxLength) return false;
        if (iTableName != null ? !iTableName.equals(that.iTableName) : that.iTableName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iTableName != null ? iTableName.hashCode() : 0;
        lresult = 31 * lresult + iCoordSystemId;
        lresult = 31 * lresult + iMaxLength;
        return lresult;
    }
}
