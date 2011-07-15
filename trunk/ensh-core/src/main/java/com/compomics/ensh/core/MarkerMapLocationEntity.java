package com.compomics.ensh.core;

/**
 * This class is a
 */
public class MarkerMapLocationEntity {
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

    private String iChromosomeName;

    public String getChromosomeName() {
        return iChromosomeName;
    }

    public void setChromosomeName(String aChromosomeName) {
        iChromosomeName = aChromosomeName;
    }

    private int iMarkerSynonymId;

    public int getMarkerSynonymId() {
        return iMarkerSynonymId;
    }

    public void setMarkerSynonymId(int aMarkerSynonymId) {
        iMarkerSynonymId = aMarkerSynonymId;
    }

    private String iPosition;

    public String getPosition() {
        return iPosition;
    }

    public void setPosition(String aPosition) {
        iPosition = aPosition;
    }

    private double iLodScore;

    public double getLodScore() {
        return iLodScore;
    }

    public void setLodScore(double aLodScore) {
        iLodScore = aLodScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarkerMapLocationEntity that = (MarkerMapLocationEntity) o;

        if (Double.compare(that.iLodScore, iLodScore) != 0) return false;
        if (iMapId != that.iMapId) return false;
        if (iMarkerId != that.iMarkerId) return false;
        if (iMarkerSynonymId != that.iMarkerSynonymId) return false;
        if (iChromosomeName != null ? !iChromosomeName.equals(that.iChromosomeName) : that.iChromosomeName != null)
            return false;
        if (iPosition != null ? !iPosition.equals(that.iPosition) : that.iPosition != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult;
        long temp;
        lresult = iMarkerId;
        lresult = 31 * lresult + iMapId;
        lresult = 31 * lresult + (iChromosomeName != null ? iChromosomeName.hashCode() : 0);
        lresult = 31 * lresult + iMarkerSynonymId;
        lresult = 31 * lresult + (iPosition != null ? iPosition.hashCode() : 0);
        temp = iLodScore != +0.0d ? Double.doubleToLongBits(iLodScore) : 0L;
        lresult = 31 * lresult + (int) (temp ^ (temp >>> 32));
        return lresult;
    }
}
