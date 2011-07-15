package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MarkerSynonymEntity {
    private int iMarkerSynonymId;

    public int getMarkerSynonymId() {
        return iMarkerSynonymId;
    }

    public void setMarkerSynonymId(int aMarkerSynonymId) {
        iMarkerSynonymId = aMarkerSynonymId;
    }

    private int iMarkerId;

    public int getMarkerId() {
        return iMarkerId;
    }

    public void setMarkerId(int aMarkerId) {
        iMarkerId = aMarkerId;
    }

    private String iSource;

    public String getSource() {
        return iSource;
    }

    public void setSource(String aSource) {
        iSource = aSource;
    }

    private String iName;

    public String getName() {
        return iName;
    }

    public void setName(String aName) {
        iName = aName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarkerSynonymEntity that = (MarkerSynonymEntity) o;

        if (iMarkerId != that.iMarkerId) return false;
        if (iMarkerSynonymId != that.iMarkerSynonymId) return false;
        if (iName != null ? !iName.equals(that.iName) : that.iName != null) return false;
        if (iSource != null ? !iSource.equals(that.iSource) : that.iSource != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMarkerSynonymId;
        lresult = 31 * lresult + iMarkerId;
        lresult = 31 * lresult + (iSource != null ? iSource.hashCode() : 0);
        lresult = 31 * lresult + (iName != null ? iName.hashCode() : 0);
        return lresult;
    }
}
