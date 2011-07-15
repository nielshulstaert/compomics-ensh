package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MetaEntity {
    private int iMetaId;

    public int getMetaId() {
        return iMetaId;
    }

    public void setMetaId(int aMetaId) {
        iMetaId = aMetaId;
    }

    private int iSpeciesId;

    public int getSpeciesId() {
        return iSpeciesId;
    }

    public void setSpeciesId(int aSpeciesId) {
        iSpeciesId = aSpeciesId;
    }

    private String iMetaKey;

    public String getMetaKey() {
        return iMetaKey;
    }

    public void setMetaKey(String aMetaKey) {
        iMetaKey = aMetaKey;
    }

    private String iMetaValue;

    public String getMetaValue() {
        return iMetaValue;
    }

    public void setMetaValue(String aMetaValue) {
        iMetaValue = aMetaValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MetaEntity that = (MetaEntity) o;

        if (iMetaId != that.iMetaId) return false;
        if (iSpeciesId != that.iSpeciesId) return false;
        if (iMetaKey != null ? !iMetaKey.equals(that.iMetaKey) : that.iMetaKey != null) return false;
        if (iMetaValue != null ? !iMetaValue.equals(that.iMetaValue) : that.iMetaValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMetaId;
        lresult = 31 * lresult + iSpeciesId;
        lresult = 31 * lresult + (iMetaKey != null ? iMetaKey.hashCode() : 0);
        lresult = 31 * lresult + (iMetaValue != null ? iMetaValue.hashCode() : 0);
        return lresult;
    }
}
