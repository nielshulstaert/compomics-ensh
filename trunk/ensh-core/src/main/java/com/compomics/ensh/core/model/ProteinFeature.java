package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 18:23:33<br>
 */
public interface ProteinFeature {
    Translation getTranslation();

    void setTranslation(Translation translation);

    int getSequenceStart();

    void setSequenceStart(int sequenceStart);

    int getSequenceEnd();

    void setSequenceEnd(int sequenceEnd);

    AlignmentHit getHit();

    void setHit(AlignmentHit hit);

    Analysis getAnalysis();

    void setAnalysis(Analysis analysis);
}
