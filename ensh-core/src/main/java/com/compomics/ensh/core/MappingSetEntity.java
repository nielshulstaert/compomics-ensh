package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MappingSetEntity {
    private int iMappingSetId;

    public int getMappingSetId() {
        return iMappingSetId;
    }

    public void setMappingSetId(int aMappingSetId) {
        iMappingSetId = aMappingSetId;
    }

    private String iSchemaBuild;

    public String getSchemaBuild() {
        return iSchemaBuild;
    }

    public void setSchemaBuild(String aSchemaBuild) {
        iSchemaBuild = aSchemaBuild;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MappingSetEntity that = (MappingSetEntity) o;

        if (iMappingSetId != that.iMappingSetId) return false;
        if (iSchemaBuild != null ? !iSchemaBuild.equals(that.iSchemaBuild) : that.iSchemaBuild != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMappingSetId;
        lresult = 31 * lresult + (iSchemaBuild != null ? iSchemaBuild.hashCode() : 0);
        return lresult;
    }
}
