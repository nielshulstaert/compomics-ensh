package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.Analysis;
import com.compomics.ensh.core.model.XrefIdentity;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 28-Sep-2007<br>
 * Time: 14:03:48<br>
 */
public class XrefIdentityImpl extends ObjectXrefImpl implements XrefIdentity {

    private Integer queryIdentity;
    private Integer targetIdentity;
    private Integer hitStart;
    private Integer hitEnd;
    private Integer translationStart;
    private Integer translationEnd;
    private String cigarLine;
    private Double score;
    private Double eValue;
    private Analysis analysis;

    @Testable
    public int getQueryIdentity() {
        return queryIdentity;
    }

    @Testable
    public void setQueryIdentity(Integer queryIdentity) {
        this.queryIdentity = queryIdentity;
    }

    @Testable
    public int getTargetIdentity() {
        return targetIdentity;
    }

    @Testable
    public void setTargetIdentity(Integer targetIdentity) {
        this.targetIdentity = targetIdentity;
    }

    @Testable
    public int getHitStart() {
        return hitStart;
    }

    @Testable
    public void setHitStart(Integer hitStart) {
        this.hitStart = hitStart;
    }

    @Testable
    public int getHitEnd() {
        return hitEnd;
    }

    @Testable
    public void setHitEnd(Integer hitEnd) {
        this.hitEnd = hitEnd;
    }

    @Testable
    public int getTranslationStart() {
        return translationStart;
    }

    @Testable
    public void setTranslationStart(Integer translationStart) {
        this.translationStart = translationStart;
    }

    @Testable
    public int getTranslationEnd() {
        return translationEnd;
    }

    @Testable
    public void setTranslationEnd(Integer translationEnd) {
        this.translationEnd = translationEnd;
    }

    @Testable
    public String getCigarLine() {
        return cigarLine;
    }

    @Testable
    public void setCigarLine(String cigarLine) {
        this.cigarLine = cigarLine;
    }

    @Testable
    public double getScore() {
        return score;
    }

    @Testable
    public void setScore(Double score) {
        this.score = score;
    }

    @Testable
    public double geteValue() {
        return eValue;
    }

    @Testable
    public void seteValue(Double eValue) {
        this.eValue = eValue;
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
        if (!(o instanceof XrefIdentity)) return false;
        if (!super.equals(o)) return false;

        XrefIdentity that = (XrefIdentity) o;

        if (!analysis.equals(that.getAnalysis())) return false;
        if (eValue != null ? !eValue.equals(that.geteValue()) : that.geteValue() != 0) return false;
        if (hitEnd != null ? !hitEnd.equals(that.getHitEnd()) : that.getHitEnd() != 0) return false;
        if (hitStart != null ? !hitStart.equals(that.getHitStart()) : that.getHitStart() != 0) return false;
        if (queryIdentity != null ? !queryIdentity.equals(that.getQueryIdentity()) : that.getQueryIdentity() != 0)
            return false;
        if (score != null ? !score.equals(that.getScore()) : that.getScore() != 0) return false;
        if (targetIdentity != null ? !targetIdentity.equals(that.getTargetIdentity()) : that.getTargetIdentity() != 0)
            return false;
        if (translationEnd != null ? !translationEnd.equals(that.getTranslationEnd()) : that.getTranslationEnd() != 0)
            return false;
        if (translationStart != null ? !translationStart.equals(that.getTranslationStart()) : that.getTranslationStart() != 0)
            return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (queryIdentity != null ? queryIdentity.hashCode() : 0);
        result = 31 * result + (targetIdentity != null ? targetIdentity.hashCode() : 0);
        result = 31 * result + (hitStart != null ? hitStart.hashCode() : 0);
        result = 31 * result + (hitEnd != null ? hitEnd.hashCode() : 0);
        result = 31 * result + (translationStart != null ? translationStart.hashCode() : 0);
        result = 31 * result + (translationEnd != null ? translationEnd.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (eValue != null ? eValue.hashCode() : 0);
        result = 31 * result + analysis.hashCode();
        return result;
    }

    public String toString() {
    return "XrefIdentityImpl{" +
            "queryIdentity=" + queryIdentity +
            ", targetIdentity=" + targetIdentity +
            ", hitStart=" + hitStart +
            ", hitEnd=" + hitEnd +
            ", translationStart=" + translationStart +
            ", translationEnd=" + translationEnd +
            ", cigarLine=" + cigarLine +
            ", score=" + score +
            ", eValue=" + eValue +
            ", analysis=" + analysis +
            '}';
}
}
