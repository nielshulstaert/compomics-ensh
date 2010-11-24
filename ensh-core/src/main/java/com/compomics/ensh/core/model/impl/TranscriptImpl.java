package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.*;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 27-Sep-2007<br>
 * Time: 12:42:58<br>
 */
public class TranscriptImpl extends AbstractEnsemblObject implements Transcript {

    private Gene gene;
    private Analysis analysis;
    private Xref displayXref;
    private String biotype;
    private String status;
    private String description;
    private boolean current;
    private Set<Exon> exons;
    private Set<ObjectXref> xrefs;
    private Set<GOAnnotation> goAnnotations;
    private Set<XrefIdentity> xrefIdentities;
    private Map<AttributeType, String> attributes;
    private StrandedLocation location;

    @Testable
    public Gene getGene() {
        return gene;
    }

    @Testable
    public void setGene(Gene gene) {
        this.gene = gene;
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
    public String getBiotype() {
        return biotype;
    }

    @Testable
    public void setBiotype(String biotype) {
        this.biotype = biotype;
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
    public Set<Exon> getExons() {
        return exons;
    }

    public void setExons(Set<Exon> exons) {
        this.exons = exons;
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
    public Set<GOAnnotation> getGoAnnotations() {

        if (goAnnotations == null) {
            goAnnotations = new TreeSet<GOAnnotation>();
            for (ObjectXref xref : xrefs)
                if (xref instanceof GOAnnotationImpl)
                    goAnnotations.add((GOAnnotationImpl) xref);
        }

        return goAnnotations;
    }

    @Testable
    public Set<XrefIdentity> getXrefIdentities() {

        if (xrefIdentities == null) {
            xrefIdentities = new TreeSet<XrefIdentity>();
            for (ObjectXref xref : xrefs)
                if (xref instanceof XrefIdentityImpl)
                    xrefIdentities.add((XrefIdentityImpl) xref);
        }

        return xrefIdentities;
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
    public StrandedLocation getLocation() {
        return location;
    }

    @Testable
    public void setLocation(StrandedLocation location) {
        this.location = location;
    }

    public int getLength(){
        return this.location.getSequenceRegionEnd() - this.location.getSequenceRegionStart() + 1;  
    }

    public Set<Integer> getExonBoundaries(){

        Set<Integer> retVal = new TreeSet<Integer>();

        int exonCount = this.getExons().size();
        int lastBoundary = 0;
        int counter = 0;
        for(Exon exon : this.getExons()){

            //don't add exon end coordinate of last exon as boundary
            if(++counter == exonCount){
                break;
            }
            int boundary = lastBoundary + exon.getLength();
            retVal.add(boundary);
            lastBoundary = boundary;
          
        }

        return retVal;

    }

}
