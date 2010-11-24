package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.GeneticMarker;
import com.compomics.ensh.core.model.GeneticMapLocation;
import com.compomics.ensh.core.model.GeneticMarkerSynonym;
import com.compomics.ensh.core.model.GeneticMarkerFeature;

import java.util.Set;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 28-Sep-2007<br>
 * Time: 14:53:35<br>
 */
public class GeneticMarkerImpl implements GeneticMarker {

    private int id;
    private GeneticMarkerSynonym displayMarkerSynonym;
    private Set<GeneticMarkerSynonym> synonyms;
    private String leftPrimer;
    private String rightPrimer;
    private int minPrimerDistance;
    private int maxPrimerDistance;
    private Integer priority;
    private String type;
    private Set<GeneticMapLocation> mapLocations;
    private Set<GeneticMarkerFeature> genomeLocations;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public GeneticMarkerSynonym getDisplayMarkerSynonym() {
        return displayMarkerSynonym;
    }

    @Testable
    public void setDisplayMarkerSynonym(GeneticMarkerSynonym displayMarkerSynonym) {
        this.displayMarkerSynonym = displayMarkerSynonym;
    }

    @Testable
    public String getLeftPrimer() {
        return leftPrimer;
    }

    @Testable
    public void setLeftPrimer(String leftPrimer) {
        this.leftPrimer = leftPrimer;
    }

    @Testable
    public String getRightPrimer() {
        return rightPrimer;
    }

    @Testable
    public void setRightPrimer(String rightPrimer) {
        this.rightPrimer = rightPrimer;
    }

    @Testable
    public int getMinPrimerDistance() {
        return minPrimerDistance;
    }

    @Testable
    public void setMinPrimerDistance(int minPrimerDistance) {
        this.minPrimerDistance = minPrimerDistance;
    }

    @Testable
    public int getMaxPrimerDistance() {
        return maxPrimerDistance;
    }

    @Testable
    public void setMaxPrimerDistance(int maxPrimerDistance) {
        this.maxPrimerDistance = maxPrimerDistance;
    }

    @Testable
    public Integer getPriority() {
        return priority;
    }

    @Testable
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Testable
    public String getType() {
        return type;
    }

    @Testable
    public void setType(String type) {
        this.type = type;
    }

    @Testable
    public Set<GeneticMarkerSynonym> getSynonyms() {
        return synonyms;
    }

    @Testable
    public void setSynonyms(Set<GeneticMarkerSynonym> synonyms) {
        this.synonyms = synonyms;
    }

    @Testable
    public Set<GeneticMapLocation> getMapLocations() {
        return mapLocations;
    }

    @Testable
    public void setMapLocations(Set<GeneticMapLocation> mapLocations) {
        this.mapLocations = mapLocations;
    }

    @Testable
    public Set<GeneticMarkerFeature> getGenomeLocations() {
        return genomeLocations;
    }

    @Testable
    public void setGenomeLocations(Set<GeneticMarkerFeature> genomeLocations) {
        this.genomeLocations = genomeLocations;
    }
   
    //inclusion of displayMarkerSynonym field in equals() and hashCode()
    //leads to cyclic dependencies and the code will hang when the hashCode()
    //is accessed by Hibernate

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof GeneticMarker)) return false;

        GeneticMarker that = (GeneticMarker) o;

        if (maxPrimerDistance != that.getMaxPrimerDistance()) return false;
        if (minPrimerDistance != that.getMinPrimerDistance()) return false;
        if (!leftPrimer.equals(that.getLeftPrimer())) return false;
        if (!rightPrimer.equals(that.getRightPrimer())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = leftPrimer.hashCode();
        result = 31 * result + rightPrimer.hashCode();
        result = 31 * result + minPrimerDistance;
        result = 31 * result + maxPrimerDistance;
        return result;
    }

     public String toString() {
        String synonym = "";
        if(displayMarkerSynonym != null)
           synonym = displayMarkerSynonym.getName();
        return "GeneticMarkerImpl{" +
                "displayMarkerSynonym=" + synonym +
                ", leftPrimer='" + leftPrimer + '\'' +
                ", rightPrimer='" + rightPrimer + '\'' +
                ", minPrimerDistance=" + minPrimerDistance +
                ", maxPrimerDistance=" + maxPrimerDistance +
                ", type='" + type + '\'' +
                '}';
    }
}
