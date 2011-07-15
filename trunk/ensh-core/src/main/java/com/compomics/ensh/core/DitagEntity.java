package com.compomics.ensh.core;

/**
 * This class is a
 */
public class DitagEntity {
    private int iDitagId;

    public int getDitagId() {
        return iDitagId;
    }

    public void setDitagId(int aDitagId) {
        iDitagId = aDitagId;
    }

    private String iName;

    public String getName() {
        return iName;
    }

    public void setName(String aName) {
        iName = aName;
    }

    private String iType;

    public String getType() {
        return iType;
    }

    public void setType(String aType) {
        iType = aType;
    }

    private short iTagCount;

    public short getTagCount() {
        return iTagCount;
    }

    public void setTagCount(short aTagCount) {
        iTagCount = aTagCount;
    }

    private String iSequence;

    public String getSequence() {
        return iSequence;
    }

    public void setSequence(String aSequence) {
        iSequence = aSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DitagEntity that = (DitagEntity) o;

        if (iDitagId != that.iDitagId) return false;
        if (iTagCount != that.iTagCount) return false;
        if (iName != null ? !iName.equals(that.iName) : that.iName != null) return false;
        if (iSequence != null ? !iSequence.equals(that.iSequence) : that.iSequence != null) return false;
        if (iType != null ? !iType.equals(that.iType) : that.iType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iDitagId;
        lresult = 31 * lresult + (iName != null ? iName.hashCode() : 0);
        lresult = 31 * lresult + (iType != null ? iType.hashCode() : 0);
        lresult = 31 * lresult + (int) iTagCount;
        lresult = 31 * lresult + (iSequence != null ? iSequence.hashCode() : 0);
        return lresult;
    }
}
