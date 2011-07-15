package com.compomics.ensh.core;

/**
 * This class is a
 */
public class QtlEntity {
    private int iQtlId;

    public int getQtlId() {
        return iQtlId;
    }

    public void setQtlId(int aQtlId) {
        iQtlId = aQtlId;
    }

    private String iTrait;

    public String getTrait() {
        return iTrait;
    }

    public void setTrait(String aTrait) {
        iTrait = aTrait;
    }

    private float iLodScore;

    public float getLodScore() {
        return iLodScore;
    }

    public void setLodScore(float aLodScore) {
        iLodScore = aLodScore;
    }

    private int iFlankMarkerId1;

    public int getFlankMarkerId1() {
        return iFlankMarkerId1;
    }

    public void setFlankMarkerId1(int aFlankMarkerId1) {
        iFlankMarkerId1 = aFlankMarkerId1;
    }

    private int iFlankMarkerId2;

    public int getFlankMarkerId2() {
        return iFlankMarkerId2;
    }

    public void setFlankMarkerId2(int aFlankMarkerId2) {
        iFlankMarkerId2 = aFlankMarkerId2;
    }

    private int iPeakMarkerId;

    public int getPeakMarkerId() {
        return iPeakMarkerId;
    }

    public void setPeakMarkerId(int aPeakMarkerId) {
        iPeakMarkerId = aPeakMarkerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QtlEntity that = (QtlEntity) o;

        if (iFlankMarkerId1 != that.iFlankMarkerId1) return false;
        if (iFlankMarkerId2 != that.iFlankMarkerId2) return false;
        if (Float.compare(that.iLodScore, iLodScore) != 0) return false;
        if (iPeakMarkerId != that.iPeakMarkerId) return false;
        if (iQtlId != that.iQtlId) return false;
        if (iTrait != null ? !iTrait.equals(that.iTrait) : that.iTrait != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iQtlId;
        lresult = 31 * lresult + (iTrait != null ? iTrait.hashCode() : 0);
        lresult = 31 * lresult + (iLodScore != +0.0f ? Float.floatToIntBits(iLodScore) : 0);
        lresult = 31 * lresult + iFlankMarkerId1;
        lresult = 31 * lresult + iFlankMarkerId2;
        lresult = 31 * lresult + iPeakMarkerId;
        return lresult;
    }
}
