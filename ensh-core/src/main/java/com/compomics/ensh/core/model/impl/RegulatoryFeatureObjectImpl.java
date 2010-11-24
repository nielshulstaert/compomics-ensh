package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.EnsemblObject;
import com.compomics.ensh.core.model.RegulatoryFeatureObject;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 10:35:57<br>
 */
public class RegulatoryFeatureObjectImpl implements RegulatoryFeatureObject {

    private RegulatoryFeature regulatoryFeature;
    private EnsemblObject ensemblObject;
    private String influence;
    private String evidence;

    @Testable
    public RegulatoryFeature getRegulatoryFeature() {
        return regulatoryFeature;
    }

    @Testable
    public void setRegulatoryFeature(RegulatoryFeature regulatoryFeature) {
        this.regulatoryFeature = regulatoryFeature;
    }

    @Testable
    public EnsemblObject getEnsemblObject() {
        return ensemblObject;
    }

    @Testable
    public void setEnsemblObject(EnsemblObject ensemblObject) {
        this.ensemblObject = ensemblObject;
    }

    @Testable
    public String getInfluence() {
        return influence;
    }

    @Testable
    public void setInfluence(String influence) {
        this.influence = influence;
    }

    @Testable
    public String getEvidence() {
        return evidence;
    }

    @Testable
    public void setEvidence(String evidence) {
        this.evidence = evidence;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(!(o instanceof RegulatoryFeatureObject)) return false;


        RegulatoryFeatureObject that = (RegulatoryFeatureObject) o;

        if (!ensemblObject.equals(that.getEnsemblObject())) return false;
        if (evidence != null ? !evidence.equals(that.getEvidence()) : that.getEvidence() != null) return false;
        if (influence != null ? !influence.equals(that.getInfluence()) : that.getInfluence() != null) return false;
        if (!regulatoryFeature.equals(that.getRegulatoryFeature())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = regulatoryFeature.hashCode();
        result = 31 * result + ensemblObject.hashCode();
        result = 31 * result + (influence != null ? influence.hashCode() : 0);
        result = 31 * result + (evidence != null ? evidence.hashCode() : 0);
        return result;
    }


    public String toString() {
        return "RegulatoryFeatureObjectImpl{" +
                "regulatoryFeature=" + regulatoryFeature.getName() +
                ", ensemblObject=" + ensemblObject.getStableId() +
                ", influence='" + influence + '\'' +
                ", evidence='" + evidence + '\'' +
                '}';
    }
}
