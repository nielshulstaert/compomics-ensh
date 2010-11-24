package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.*;

import java.util.Set;
import java.util.Map;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 26-Sep-2007<br>
 * Time: 19:01:50<br>
 */
public class GeneImpl extends AbstractEnsemblObject implements Gene {

    private String biotype;
    private Analysis analysis;
    private com.compomics.ensh.core.model.Xref displayXref;
    private String source;
    private String status;
    private String description;
    private boolean current;
    private Set<Transcript> transcripts;
    private Map<AttributeType, String> attributes;
    private Set<ObjectXref> xrefs;
    private Location location;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getBiotype() {
        return biotype;
    }

    @Testable
    public void setBiotype(String biotype) {
        this.biotype = biotype;
    }



    @Testable
    public String getSource() {
        return source;
    }

    @Testable
    public void setSource(String source) {
        this.source = source;
    }

    @Testable
    public String getStatus() {
        return status;
    }

    @Testable
    public void setStatus(String status) {
        this.status = status;
    }

    @Testable
    public String getDescription() {
        return description;
    }

    @Testable
    public void setDescription(String description) {
        this.description = description;
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
    public com.compomics.ensh.core.model.Xref getDisplayXref() {
        return displayXref;
    }

    @Testable
    public void setDisplayXref(com.compomics.ensh.core.model.Xref displayXref) {
        this.displayXref = displayXref;
    }

    @Testable
    public Set<Transcript> getTranscripts() {
        return transcripts;
    }

    @Testable
    public void setTranscripts(Set<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

    @Testable
    public Analysis getAnalysis() {
        return analysis;
    }

    @Testable
    public void setAnalysis(Analysis analysis) {
        this.analysis = analysis;
    }

    @Testable
    public Map<AttributeType, String> getAttributes() {
        return attributes;
    }

    @Testable
    public void setAttributes(Map<AttributeType, String> attributes) {
        this.attributes = attributes;
    }

    @Testable
    public Set<ObjectXref> getXrefs() {
        return xrefs;
    }

    @Testable
    public void setXrefs(Set<ObjectXref> xrefs) {
        this.xrefs = xrefs;
    }

    @Testable
    public Location getLocation() {
        return location;
    }

    @Testable
    public void setLocation(Location location) {
        this.location = location;
    }

    public String toString() {
        return super.toString() + " (" + this.getLocation().toString() + ")";
    }
}
