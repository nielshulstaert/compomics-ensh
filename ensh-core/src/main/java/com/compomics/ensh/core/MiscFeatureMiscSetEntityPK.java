package com.compomics.ensh.core;

import java.io.Serializable;

/**
 * This class is a
 */
public class MiscFeatureMiscSetEntityPK implements Serializable {
    private int iMiscFeatureId;

    public int getMiscFeatureId() {
        return iMiscFeatureId;
    }

    public void setMiscFeatureId(int aMiscFeatureId) {
        iMiscFeatureId = aMiscFeatureId;
    }

    private short iMiscSetId;

    public short getMiscSetId() {
        return iMiscSetId;
    }

    public void setMiscSetId(short aMiscSetId) {
        iMiscSetId = aMiscSetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MiscFeatureMiscSetEntityPK that = (MiscFeatureMiscSetEntityPK) o;

        if (iMiscFeatureId != that.iMiscFeatureId) return false;
        if (iMiscSetId != that.iMiscSetId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMiscFeatureId;
        lresult = 31 * lresult + (int) iMiscSetId;
        return lresult;
    }
}
