package com.compomics.ensh.core;

/**
 * This class is a
 */
public class SupportingFeatureEntity {
    private int iExonId;

    public int getExonId() {
        return iExonId;
    }

    public void setExonId(int aExonId) {
        iExonId = aExonId;
    }

    private String iFeatureType;

    public String getFeatureType() {
        return iFeatureType;
    }

    public void setFeatureType(String aFeatureType) {
        iFeatureType = aFeatureType;
    }

    private int iFeatureId;

    public int getFeatureId() {
        return iFeatureId;
    }

    public void setFeatureId(int aFeatureId) {
        iFeatureId = aFeatureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupportingFeatureEntity that = (SupportingFeatureEntity) o;

        if (iExonId != that.iExonId) return false;
        if (iFeatureId != that.iFeatureId) return false;
        if (iFeatureType != null ? !iFeatureType.equals(that.iFeatureType) : that.iFeatureType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iExonId;
        lresult = 31 * lresult + (iFeatureType != null ? iFeatureType.hashCode() : 0);
        lresult = 31 * lresult + iFeatureId;
        return lresult;
    }
}
