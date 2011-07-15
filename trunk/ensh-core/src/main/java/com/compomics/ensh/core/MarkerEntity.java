package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MarkerEntity {
    private int iMarkerId;

    public int getMarkerId() {
        return iMarkerId;
    }

    public void setMarkerId(int aMarkerId) {
        iMarkerId = aMarkerId;
    }

    private int iDisplayMarkerSynonymId;

    public int getDisplayMarkerSynonymId() {
        return iDisplayMarkerSynonymId;
    }

    public void setDisplayMarkerSynonymId(int aDisplayMarkerSynonymId) {
        iDisplayMarkerSynonymId = aDisplayMarkerSynonymId;
    }

    private String iLeftPrimer;

    public String getLeftPrimer() {
        return iLeftPrimer;
    }

    public void setLeftPrimer(String aLeftPrimer) {
        iLeftPrimer = aLeftPrimer;
    }

    private String iRightPrimer;

    public String getRightPrimer() {
        return iRightPrimer;
    }

    public void setRightPrimer(String aRightPrimer) {
        iRightPrimer = aRightPrimer;
    }

    private int iMinPrimerDist;

    public int getMinPrimerDist() {
        return iMinPrimerDist;
    }

    public void setMinPrimerDist(int aMinPrimerDist) {
        iMinPrimerDist = aMinPrimerDist;
    }

    private int iMaxPrimerDist;

    public int getMaxPrimerDist() {
        return iMaxPrimerDist;
    }

    public void setMaxPrimerDist(int aMaxPrimerDist) {
        iMaxPrimerDist = aMaxPrimerDist;
    }

    private int iPriority;

    public int getPriority() {
        return iPriority;
    }

    public void setPriority(int aPriority) {
        iPriority = aPriority;
    }

    private String iType;

    public String getType() {
        return iType;
    }

    public void setType(String aType) {
        iType = aType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarkerEntity that = (MarkerEntity) o;

        if (iDisplayMarkerSynonymId != that.iDisplayMarkerSynonymId) return false;
        if (iMarkerId != that.iMarkerId) return false;
        if (iMaxPrimerDist != that.iMaxPrimerDist) return false;
        if (iMinPrimerDist != that.iMinPrimerDist) return false;
        if (iPriority != that.iPriority) return false;
        if (iLeftPrimer != null ? !iLeftPrimer.equals(that.iLeftPrimer) : that.iLeftPrimer != null) return false;
        if (iRightPrimer != null ? !iRightPrimer.equals(that.iRightPrimer) : that.iRightPrimer != null) return false;
        if (iType != null ? !iType.equals(that.iType) : that.iType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = iMarkerId;
        lresult = 31 * lresult + iDisplayMarkerSynonymId;
        lresult = 31 * lresult + (iLeftPrimer != null ? iLeftPrimer.hashCode() : 0);
        lresult = 31 * lresult + (iRightPrimer != null ? iRightPrimer.hashCode() : 0);
        lresult = 31 * lresult + iMinPrimerDist;
        lresult = 31 * lresult + iMaxPrimerDist;
        lresult = 31 * lresult + iPriority;
        lresult = 31 * lresult + (iType != null ? iType.hashCode() : 0);
        return lresult;
    }
}
