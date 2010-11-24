package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.*;

import java.util.Set;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 27-Sep-2007<br>
 * Time: 14:45:42<br>
 */
public class ExonImpl extends AbstractEnsemblObject implements Exon {

    private int phase;
    private int endPhase;
    private boolean current;
    private StrandedLocation location;
    private Set<AlignmentFeature> supportingFeatures;
    private Set<Transcript> transcripts;

    @Testable
    public int getPhase() {
        return phase;
    }

    @Testable
    public void setPhase(int phase) {
        this.phase = phase;
    }

    @Testable
    public int getEndPhase() {
        return endPhase;
    }

    public void setEndPhase(int endPhase) {
        this.endPhase = endPhase;
    }


    @Testable
    public boolean isCurrent() {
        return current;
    }

    @Testable
    public void setCurrent(boolean current) {
        this.current = current;
    }

    @Testable
    public Set<AlignmentFeature> getSupportingFeatures() {
        return supportingFeatures;
    }

    @Testable
    public void setSupportingFeatures(Set<AlignmentFeature> supportingFeatures) {
        this.supportingFeatures = supportingFeatures;
    }

    @Testable
    public StrandedLocation getLocation() {
        return location;
    }

    @Testable
    public void setLocation(StrandedLocation location) {
        this.location = location;
    }

    @Testable
    public Set<Transcript> getTranscripts() {
        return transcripts;
    }

    @Testable
    public void setTranscripts(Set<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

    public int getLength(){
        return this.location.getSequenceRegionEnd() - this.location.getSequenceRegionStart() + 1;  
    }

    @Testable
    public String toString() {
        return stableId + " (" + location + ")";
    }
}
