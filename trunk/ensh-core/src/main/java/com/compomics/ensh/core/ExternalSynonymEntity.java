package com.compomics.ensh.core;

/**
 * This class is a
 */
public class ExternalSynonymEntity {
    private int iXrefId;

    public int getXrefId() {
        return iXrefId;
    }

    public void setXrefId(int aXrefId) {
        iXrefId = aXrefId;
    }

    private String iSynonym;

    public String getSynonym() {
        return iSynonym;
    }

    public void setSynonym(String aSynonym) {
        iSynonym = aSynonym;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExternalSynonymEntity that = (ExternalSynonymEntity) o;

        if (iXrefId != that.iXrefId) return false;
        if (iSynonym != null ? !iSynonym.equals(that.iSynonym) : that.iSynonym != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iXrefId;
        lresult = 31 * lresult + (iSynonym != null ? iSynonym.hashCode() : 0);
        return lresult;
    }
}
