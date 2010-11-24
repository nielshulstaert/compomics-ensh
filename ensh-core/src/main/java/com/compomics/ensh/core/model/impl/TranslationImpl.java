package com.compomics.ensh.core.model.impl;

import test.Testable;

import java.util.*;

import com.compomics.ensh.core.model.*;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 27-Sep-2007<br>
 * Time: 13:41:27<br>
 */
public class TranslationImpl extends AbstractEnsemblObject implements Translation {

    private Transcript transcript;
    private int sequenceStart;
    private Exon startExon;
    private int sequenceEnd;
    private Exon endExon;
    private Set<ObjectXref> xrefs;
    private Set<GOAnnotation> goAnnotations;
    private Set<XrefIdentity> xrefIdentities;
    private Set<ProteinFeature> sequenceFeatures;
    private Map<AttributeType, String> attributes;

    @Testable
    public Transcript getTranscript() {
        return transcript;
    }

    @Testable
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    @Testable
    public int getSequenceStart() {
        return sequenceStart;
    }

    @Testable
    public void setSequenceStart(int sequenceStart) {
        this.sequenceStart = sequenceStart;
    }

    @Testable
    public int getSequenceEnd() {
        return sequenceEnd;
    }

    @Testable
    public void setSequenceEnd(int sequenceEnd) {
        this.sequenceEnd = sequenceEnd;
    }

    @Testable
    public Exon getStartExon() {
        return startExon;
    }

    @Testable
    public void setStartExon(Exon startExon) {
        this.startExon = startExon;
    }

    @Testable
    public Exon getEndExon() {
        return endExon;
    }

    @Testable
    public void setEndExon(Exon endExon) {
        this.endExon = endExon;
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
                if (xref instanceof GOAnnotation)
                    goAnnotations.add((GOAnnotation) xref);
        }

        return goAnnotations;
    }

    @Testable
    public Set<XrefIdentity> getXrefIdentities() {

        if (xrefIdentities == null) {
            xrefIdentities = new TreeSet<XrefIdentity>();
            for (ObjectXref xref : xrefs)
                if (xref instanceof XrefIdentity)
                    xrefIdentities.add((XrefIdentity) xref);
        }

        return xrefIdentities;
    }

    @Testable
    public Set<ProteinFeature> getSequenceFeatures() {
        return sequenceFeatures;
    }

    @Testable
    public void setSequenceFeatures(Set<ProteinFeature> sequenceFeatures) {
        this.sequenceFeatures = sequenceFeatures;
    }

    @Testable
    public Map<AttributeType, String> getAttributes() {
        return attributes;
    }

    @Testable
    public void setAttributes(Map<AttributeType, String> attributes) {
        this.attributes = attributes;
    }

    public Map<Integer, List<Exon>> getExonBoundaries() {

        Map<Integer, List<Exon>> retVal = new TreeMap<Integer, List<Exon>>();
        int codonSize = 3;
        Iterator<Exon> exons = this.getTranscript().getExons().iterator();
        Exon exon = null;

        //forward to CDS start exon                
        while (exons.hasNext()) {
            exon = exons.next();
            if (exon.equals(this.getStartExon())) {
                break;
            }
        }

        //calculate exon boundary on translation
        //boundaries that fall on an amino acid
        //will be "rounded down" to the previous
        //amino acid
        int lastCdsExonBoundary = 0;
        int cdsExonBoundary = 0;
        int boundary = 0;

        while (exons.hasNext() && exon != null) {

            Exon nextExon = exons.next();

            String exonId = exon.getStableId().getStableId();
            String nextExonId = nextExon.getStableId().getStableId();

            //add first exon boundary  (start exon length - CDS start + 1)/ codon size
            if (exon.equals(this.getStartExon())) {

                cdsExonBoundary = exon.getLength() - this.getSequenceStart() + 1;


            } else if (exon.equals(this.getEndExon())) {

                break;

            } else {

                cdsExonBoundary = lastCdsExonBoundary + exon.getLength();

            }


            boundary = cdsExonBoundary / codonSize;
            lastCdsExonBoundary = cdsExonBoundary;

            retVal.put(boundary, new ArrayList<Exon>());
            retVal.get(boundary).add(exon);
            retVal.get(boundary).add(nextExon);
                        
            exon = nextExon;

        }

        return retVal;

    }

    public String toString() {
        return super.toString();
    }
}
