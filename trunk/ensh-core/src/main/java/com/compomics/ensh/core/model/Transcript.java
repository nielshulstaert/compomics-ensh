package com.compomics.ensh.core.model;

import java.util.*;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 12:12:45<br>
 */
public interface Transcript extends EnsemblObject, Locatable<StrandedLocation> {

    Gene getGene();

    void setGene(Gene gene);

    Xref getDisplayXref();

    void setDisplayXref(Xref displayXref);

    String getBiotype();

    void setBiotype(String biotype);

    String getStatus();

    void setStatus(String status);

    String getDescription();

    void setDescription(String description);

    boolean isCurrent();

    void setCurrent(boolean current);

    Set<Exon> getExons();

    void setExons(Set<Exon> exons);

    Set<ObjectXref> getXrefs();

    void setXrefs(Set<ObjectXref> xrefs);

    Set<GOAnnotation> getGoAnnotations();

    Set<XrefIdentity> getXrefIdentities();

    Analysis getAnalysis();

    void setAnalysis(Analysis analysis);

    Map<AttributeType, String> getAttributes();

    void setAttributes(Map<AttributeType, String> attributes);

    int getLength();

    Set<Integer> getExonBoundaries();

}
