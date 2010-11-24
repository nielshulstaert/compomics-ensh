package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.SupportingFeature;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 11:05:35<br>
 */
public interface Exon extends EnsemblObject, Locatable<StrandedLocation> {

    int getPhase();

    void setPhase(int phase);

    int getEndPhase();

    void setEndPhase(int endPhase);

    boolean isCurrent();

    void setCurrent(boolean current);

    Set<AlignmentFeature> getSupportingFeatures();

    void setSupportingFeatures(Set<AlignmentFeature> supportingFeatures);

    Set<Transcript> getTranscripts();

    void setTranscripts(Set<Transcript> transcripts);

    int getLength();
    
}
