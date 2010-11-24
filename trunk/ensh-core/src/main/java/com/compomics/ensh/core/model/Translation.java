package com.compomics.ensh.core.model;

import java.util.Set;
import java.util.Map;
import java.util.List;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 17:54:40<br>
 */
public interface Translation extends EnsemblObject {

    Transcript getTranscript();

    void setTranscript(Transcript transcript);

    int getSequenceStart();

    void setSequenceStart(int sequenceStart);

    int getSequenceEnd();

    void setSequenceEnd(int sequenceEnd);

    Exon getStartExon();

    void setStartExon(Exon startExon);

    Exon getEndExon();

    void setEndExon(Exon endExon);

    Set<ObjectXref> getXrefs();

    void setXrefs(Set<ObjectXref> xrefs);

    Set<GOAnnotation> getGoAnnotations();

    Set<XrefIdentity> getXrefIdentities();

    Set<ProteinFeature> getSequenceFeatures();

    void setSequenceFeatures(Set<ProteinFeature> sequenceFeatures);

    Map<AttributeType, String> getAttributes();

    void setAttributes(Map<AttributeType, String> attributes);

    Map<Integer, List<Exon>> getExonBoundaries();

}
