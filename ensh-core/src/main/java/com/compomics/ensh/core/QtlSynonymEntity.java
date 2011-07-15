package com.compomics.ensh.core;

/**
 * This class is a
 */
public class QtlSynonymEntity {
    private int iQtlSynonymId;

    public int getQtlSynonymId() {
        return iQtlSynonymId;
    }

    public void setQtlSynonymId(int aQtlSynonymId) {
        iQtlSynonymId = aQtlSynonymId;
    }

    private int iQtlId;

    public int getQtlId() {
        return iQtlId;
    }

    public void setQtlId(int aQtlId) {
        iQtlId = aQtlId;
    }

    private String iSourceDatabase;

    public String getSourceDatabase() {
        return iSourceDatabase;
    }

    public void setSourceDatabase(String aSourceDatabase) {
        iSourceDatabase = aSourceDatabase;
    }

    private String iSourcePrimaryId;

    public String getSourcePrimaryId() {
        return iSourcePrimaryId;
    }

    public void setSourcePrimaryId(String aSourcePrimaryId) {
        iSourcePrimaryId = aSourcePrimaryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QtlSynonymEntity that = (QtlSynonymEntity) o;

        if (iQtlId != that.iQtlId) return false;
        if (iQtlSynonymId != that.iQtlSynonymId) return false;
        if (iSourceDatabase != null ? !iSourceDatabase.equals(that.iSourceDatabase) : that.iSourceDatabase != null)
            return false;
        if (iSourcePrimaryId != null ? !iSourcePrimaryId.equals(that.iSourcePrimaryId) : that.iSourcePrimaryId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iQtlSynonymId;
        lresult = 31 * lresult + iQtlId;
        lresult = 31 * lresult + (iSourceDatabase != null ? iSourceDatabase.hashCode() : 0);
        lresult = 31 * lresult + (iSourcePrimaryId != null ? iSourcePrimaryId.hashCode() : 0);
        return lresult;
    }
}
