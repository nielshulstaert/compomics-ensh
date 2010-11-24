package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.GeneticMarker;
import com.compomics.ensh.core.model.QTL;
import com.compomics.ensh.core.model.QTLSynonym;

import java.util.Set;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 09:58:11<br>
 */
public class QTLImpl implements QTL {

    private int id;
    private String trait;
    private Float lodScore;
    private GeneticMarker flankingMarker1;
    private GeneticMarker flankingMarker2;
    private GeneticMarker peakMarker;
    private Set<QTLSynonym> synonyms;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getTrait() {
        return trait;
    }

    @Testable
    public void setTrait(String trait) {
        this.trait = trait;
    }

    @Testable
    public Float getLodScore() {
        return lodScore;
    }

    @Testable
    public void setLodScore(Float lodScore) {
        this.lodScore = lodScore;
    }

    @Testable
    public GeneticMarker getFlankingMarker1() {
        return flankingMarker1;
    }

    @Testable
    public void setFlankingMarker1(GeneticMarker flankingMarker1) {
        this.flankingMarker1 = flankingMarker1;
    }

    @Testable
    public GeneticMarker getFlankingMarker2() {
        return flankingMarker2;
    }

    @Testable
    public void setFlankingMarker2(GeneticMarker flankingMarker2) {
        this.flankingMarker2 = flankingMarker2;
    }

    @Testable
    public GeneticMarker getPeakMarker() {
        return peakMarker;
    }

    @Testable
    public void setPeakMarker(GeneticMarker peakMarker) {
        this.peakMarker = peakMarker;
    }

    @Testable
    public Set<QTLSynonym> getSynonyms() {
        return synonyms;
    }

    @Testable
    public void setSynonyms(Set<QTLSynonym> synonyms) {
        this.synonyms = synonyms;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
                if (!(o instanceof QTL)) return false;

                QTL qtl = (QTL) o;


        if (flankingMarker1 != null ? !flankingMarker1.equals(qtl.getFlankingMarker1()) : qtl.getFlankingMarker1() != null)
            return false;
        if (flankingMarker2 != null ? !flankingMarker2.equals(qtl.getFlankingMarker2()) : qtl.getFlankingMarker2() != null)
            return false;
        if (lodScore != null ? !lodScore.equals(qtl.getLodScore()) : qtl.getLodScore() != null) return false;
        if (peakMarker != null ? !peakMarker.equals(qtl.getPeakMarker()) : qtl.getPeakMarker() != null) return false;
        if (!trait.equals(qtl.getTrait())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = trait.hashCode();
        result = 31 * result + (lodScore != null ? lodScore.hashCode() : 0);
        result = 31 * result + (flankingMarker1 != null ? flankingMarker1.hashCode() : 0);
        result = 31 * result + (flankingMarker2 != null ? flankingMarker2.hashCode() : 0);
        result = 31 * result + (peakMarker != null ? peakMarker.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "QTLImpl{" +
                "trait='" + trait + '\'' +
                ", lodScore=" + lodScore +
                ", flankingMarker1=" + flankingMarker1.getDisplayMarkerSynonym() +
                ", flankingMarker2=" + flankingMarker2.getDisplayMarkerSynonym() +
                ", peakMarker=" + peakMarker.getDisplayMarkerSynonym() +
                '}';
    }
}
