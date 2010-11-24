package com.compomics.ensh.core.model;

import java.util.Set;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 12:16:32<br>
 */
public interface Gene extends EnsemblObject, Locatable {

    String getBiotype();

    void setBiotype(String biotype);

    String getSource();

    void setSource(String source);

    String getStatus();

    void setStatus(String status);

    String getDescription();

    void setDescription(String description);

    boolean isCurrent();

    void setCurrent(boolean current);

    Xref getDisplayXref();

    void setDisplayXref(Xref displayXref);

    Set<Transcript> getTranscripts();

    void setTranscripts(Set<Transcript> transcripts);

    Analysis getAnalysis();

    void setAnalysis(Analysis analysis);

    Map<AttributeType, String> getAttributes();

    void setAttributes(Map<AttributeType, String> attributes);

    Set<ObjectXref> getXrefs();

    void setXrefs(Set<ObjectXref> xrefs);
}
