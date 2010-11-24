package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.RegulatoryFeature;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 18:50:17<br>
 */
public interface RegulatoryFeatureObject {
    RegulatoryFeature getRegulatoryFeature();

    void setRegulatoryFeature(RegulatoryFeature regulatoryFeature);

    EnsemblObject getEnsemblObject();

    void setEnsemblObject(EnsemblObject ensemblObject);

    String getInfluence();

    void setInfluence(String influence);

    String getEvidence();

    void setEvidence(String evidence);
}
