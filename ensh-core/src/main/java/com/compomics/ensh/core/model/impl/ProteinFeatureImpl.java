package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.AlignmentHit;
import com.compomics.ensh.core.model.Translation;
import com.compomics.ensh.core.model.Analysis;
import com.compomics.ensh.core.model.ProteinFeature;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 11:14:53<br>
 */
public class ProteinFeatureImpl implements ProteinFeature {

    private int id;
    private Translation translation;
    private int sequenceStart;
    private int sequenceEnd;
    private AlignmentHit hit;
    private Analysis analysis;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public Translation getTranslation() {
        return translation;
    }

    @Testable
    public void setTranslation(Translation translation) {
        this.translation = translation;
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
    public AlignmentHit getHit() {
        return hit;
    }

    @Testable
    public void setHit(AlignmentHit hit) {
        this.hit = hit;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof ProteinFeature)) return false;

        ProteinFeature that = (ProteinFeature) o;

        if (sequenceEnd != that.getSequenceEnd()) return false;
        if (sequenceStart != that.getSequenceStart()) return false;
        if (!analysis.equals(that.getAnalysis())) return false;
        if (!hit.equals(that.getHit())) return false;
        if (!translation.equals(that.getTranslation())) return false;

        return true;
    }

    @Testable
    public int hashCode() {
        int result;
        result = translation.hashCode();
        result = 31 * result + sequenceStart;
        result = 31 * result + sequenceEnd;
        result = 31 * result + hit.hashCode();
        result = 31 * result + analysis.hashCode();
        return result;
    }

    public String toString() {
        return "ProteinFeature{" +
                "translation=" + translation +
                ", sequenceStart=" + sequenceStart +
                ", sequenceEnd=" + sequenceEnd +
                ", hit=" + hit +
                '}';
    }


}
