package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.GeneticMap;
import com.compomics.ensh.core.model.GeneticMapLocation;
import com.compomics.ensh.core.model.GeneticMarkerSynonym;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 28-Sep-2007<br>
 * Time: 16:03:07<br>
 */
public class GeneticMapLocationImpl implements GeneticMapLocation {

    private GeneticMap map;
    private String chromosomeName;
    private GeneticMarkerSynonym markerName;
    private String position;
    private Double lodScore;

    @Testable
    public GeneticMap getMap() {
        return map;
    }
   
    @Testable
    public void setMap(GeneticMap map) {
        this.map = map;
    }

    @Testable
    public String getChromosomeName() {
        return chromosomeName;
    }

    @Testable
    public void setChromosomeName(String chromosomeName) {
        this.chromosomeName = chromosomeName;
    }

    @Testable
    public GeneticMarkerSynonym getMarkerName() {
        return markerName;
    }

    @Testable
    public void setMarkerName(GeneticMarkerSynonym markerName) {
        this.markerName = markerName;
    }

    @Testable
    public String getPosition() {
        return position;
    }

    @Testable
    public void setPosition(String position) {
        this.position = position;
    }

    @Testable
    public Double getLodScore() {
        return lodScore;
    }

    @Testable
    public void setLodScore(Double lodScore) {
        this.lodScore = lodScore;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof GeneticMapLocation)) return false;

        GeneticMapLocation that = (GeneticMapLocation) o;

        if (!chromosomeName.equals(that.getChromosomeName())) return false;
        if (lodScore != null ? !lodScore.equals(that.getLodScore()) : that.getLodScore() != null) return false;
        if (!map.equals(that.getMap())) return false;
        if (!markerName.equals(that.getMarkerName())) return false;
        if (!position.equals(that.getPosition())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = map.hashCode();
        result = 31 * result + chromosomeName.hashCode();
        result = 31 * result + markerName.hashCode();
        result = 31 * result + position.hashCode();
        result = 31 * result + (lodScore != null ? lodScore.hashCode() : 0);
        return result;
    }

    @Testable
    public int compareTo(GeneticMapLocation that) {

        if(this == that) return 0;

        if(this.equals(that)) return 0;

        //TODO implement properly
        if(!this.getMap().equals(that.getMap())) return this.getMap().compareTo(that.getMap());
        if(!this.getChromosomeName().equals(that.getChromosomeName())) return this.getChromosomeName().compareTo(that.getChromosomeName());
        return this.getPosition().compareTo(that.getPosition());

    }

    public String toString() {
        return " Map " + map + "| chromosome " + chromosomeName + ":" + position +  " (LOD " + lodScore + ")";
    }
}
