package com.compomics.ensh.core;

/**
 * This class is a
 */
public class AltAlleleEntity {
    private int iAltAlleleId;

    public int getAltAlleleId() {
        return iAltAlleleId;
    }

    public void setAltAlleleId(int aAltAlleleId) {
        iAltAlleleId = aAltAlleleId;
    }

    private int iGeneId;

    public int getGeneId() {
        return iGeneId;
    }

    public void setGeneId(int aGeneId) {
        iGeneId = aGeneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AltAlleleEntity that = (AltAlleleEntity) o;

        if (iAltAlleleId != that.iAltAlleleId) return false;
        if (iGeneId != that.iGeneId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iAltAlleleId;
        lresult = 31 * lresult + iGeneId;
        return lresult;
    }
}
