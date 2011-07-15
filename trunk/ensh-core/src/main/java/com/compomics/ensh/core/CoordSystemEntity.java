package com.compomics.ensh.core;

/**
 * This class is a
 */
public class CoordSystemEntity {
    private int iCoordSystemId;

    public int getCoordSystemId() {
        return iCoordSystemId;
    }

    public void setCoordSystemId(int aCoordSystemId) {
        iCoordSystemId = aCoordSystemId;
    }

    private int iSpeciesId;

    public int getSpeciesId() {
        return iSpeciesId;
    }

    public void setSpeciesId(int aSpeciesId) {
        iSpeciesId = aSpeciesId;
    }

    private String iName;

    public String getName() {
        return iName;
    }

    public void setName(String aName) {
        iName = aName;
    }

    private String iVersion;

    public String getVersion() {
        return iVersion;
    }

    public void setVersion(String aVersion) {
        iVersion = aVersion;
    }

    private int iRank;

    public int getRank() {
        return iRank;
    }

    public void setRank(int aRank) {
        iRank = aRank;
    }

    private String iAttrib;

    public String getAttrib() {
        return iAttrib;
    }

    public void setAttrib(String aAttrib) {
        iAttrib = aAttrib;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoordSystemEntity that = (CoordSystemEntity) o;

        if (iCoordSystemId != that.iCoordSystemId) return false;
        if (iRank != that.iRank) return false;
        if (iSpeciesId != that.iSpeciesId) return false;
        if (iAttrib != null ? !iAttrib.equals(that.iAttrib) : that.iAttrib != null) return false;
        if (iName != null ? !iName.equals(that.iName) : that.iName != null) return false;
        if (iVersion != null ? !iVersion.equals(that.iVersion) : that.iVersion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iCoordSystemId;
        lresult = 31 * lresult + iSpeciesId;
        lresult = 31 * lresult + (iName != null ? iName.hashCode() : 0);
        lresult = 31 * lresult + (iVersion != null ? iVersion.hashCode() : 0);
        lresult = 31 * lresult + iRank;
        lresult = 31 * lresult + (iAttrib != null ? iAttrib.hashCode() : 0);
        return lresult;
    }
}
