package com.compomics.ensh.core;

import java.io.Serializable;

/**
 * This class is a
 */
public class MarkerMapLocationEntityPK implements Serializable {
    private int iMarkerId;

    public int getMarkerId() {
        return iMarkerId;
    }

    public void setMarkerId(int aMarkerId) {
        iMarkerId = aMarkerId;
    }

    private int iMapId;

    public int getMapId() {
        return iMapId;
    }

    public void setMapId(int aMapId) {
        iMapId = aMapId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarkerMapLocationEntityPK that = (MarkerMapLocationEntityPK) o;

        if (iMapId != that.iMapId) return false;
        if (iMarkerId != that.iMarkerId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMarkerId;
        lresult = 31 * lresult + iMapId;
        return lresult;
    }
}
