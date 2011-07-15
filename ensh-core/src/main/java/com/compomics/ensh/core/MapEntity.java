package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MapEntity {
    private int iMapId;

    public int getMapId() {
        return iMapId;
    }

    public void setMapId(int aMapId) {
        iMapId = aMapId;
    }

    private String iMapName;

    public String getMapName() {
        return iMapName;
    }

    public void setMapName(String aMapName) {
        iMapName = aMapName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapEntity that = (MapEntity) o;

        if (iMapId != that.iMapId) return false;
        if (iMapName != null ? !iMapName.equals(that.iMapName) : that.iMapName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMapId;
        lresult = 31 * lresult + (iMapName != null ? iMapName.hashCode() : 0);
        return lresult;
    }
}
