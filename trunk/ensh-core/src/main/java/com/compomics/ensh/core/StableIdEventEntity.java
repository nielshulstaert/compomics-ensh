package com.compomics.ensh.core;

/**
 * This class is a
 */
public class StableIdEventEntity {
    private String iOldStableId;

    public String getOldStableId() {
        return iOldStableId;
    }

    public void setOldStableId(String aOldStableId) {
        iOldStableId = aOldStableId;
    }

    private short iOldVersion;

    public short getOldVersion() {
        return iOldVersion;
    }

    public void setOldVersion(short aOldVersion) {
        iOldVersion = aOldVersion;
    }

    private String iNewStableId;

    public String getNewStableId() {
        return iNewStableId;
    }

    public void setNewStableId(String aNewStableId) {
        iNewStableId = aNewStableId;
    }

    private short iNewVersion;

    public short getNewVersion() {
        return iNewVersion;
    }

    public void setNewVersion(short aNewVersion) {
        iNewVersion = aNewVersion;
    }

    private int iMappingSessionId;

    public int getMappingSessionId() {
        return iMappingSessionId;
    }

    public void setMappingSessionId(int aMappingSessionId) {
        iMappingSessionId = aMappingSessionId;
    }

    private String iType;

    public String getType() {
        return iType;
    }

    public void setType(String aType) {
        iType = aType;
    }

    private float iScore;

    public float getScore() {
        return iScore;
    }

    public void setScore(float aScore) {
        iScore = aScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StableIdEventEntity that = (StableIdEventEntity) o;

        if (iMappingSessionId != that.iMappingSessionId) return false;
        if (iNewVersion != that.iNewVersion) return false;
        if (iOldVersion != that.iOldVersion) return false;
        if (Float.compare(that.iScore, iScore) != 0) return false;
        if (iNewStableId != null ? !iNewStableId.equals(that.iNewStableId) : that.iNewStableId != null) return false;
        if (iOldStableId != null ? !iOldStableId.equals(that.iOldStableId) : that.iOldStableId != null) return false;
        if (iType != null ? !iType.equals(that.iType) : that.iType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iOldStableId != null ? iOldStableId.hashCode() : 0;
        lresult = 31 * lresult + (int) iOldVersion;
        lresult = 31 * lresult + (iNewStableId != null ? iNewStableId.hashCode() : 0);
        lresult = 31 * lresult + (int) iNewVersion;
        lresult = 31 * lresult + iMappingSessionId;
        lresult = 31 * lresult + (iType != null ? iType.hashCode() : 0);
        lresult = 31 * lresult + (iScore != +0.0f ? Float.floatToIntBits(iScore) : 0);
        return lresult;
    }
}
