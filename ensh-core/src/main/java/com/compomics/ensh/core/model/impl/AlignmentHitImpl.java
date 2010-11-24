package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.AlignmentHit;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 18:02:48<br>
 */
public class AlignmentHitImpl implements AlignmentHit {

    private String hitName;
    private int hitStart;
    private int hitEnd;
    private int hitStrand;
    private Double score;
    private Double eValue;
    private Float percentIdentity;

    @Testable
    public String getHitName() {
        return hitName;
    }

    @Testable
    public void setHitName(String hitName) {
        this.hitName = hitName;
    }

    @Testable
    public int getHitStart() {
        return hitStart;
    }

    @Testable
    public void setHitStart(int hitStart) {
        this.hitStart = hitStart;
    }

    @Testable
    public int getHitEnd() {
        return hitEnd;
    }

    @Testable
    public void setHitEnd(int hitEnd) {
        this.hitEnd = hitEnd;
    }

    @Testable
    public int getHitStrand() {
        return hitStrand;
    }

    @Testable
    public void setHitStrand(int hitStrand) {
        this.hitStrand = hitStrand;
    }

    @Testable
    public Double getScore() {
        return score;
    }

    @Testable
    public void setScore(Double score) {
        this.score = score;
    }

    @Testable
    public Double getEValue() {
        return eValue;
    }

    @Testable
    public void setEValue(Double eValue) {
        this.eValue = eValue;
    }

    @Testable
    public Float getPercentIdentity() {
        return percentIdentity;
    }

    @Testable
    public void setPercentIdentity(Float percentIdentity) {
        this.percentIdentity = percentIdentity;
    }


    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof AlignmentHit)) return false;

        AlignmentHit that = (AlignmentHit) o;

        if (hitEnd != that.getHitEnd()) return false;
        if (hitStart != that.getHitStart()) return false;
        if (hitStrand != that.getHitStrand()) return false;
        if (eValue != null ? !eValue.equals(that.getEValue()) : that.getEValue() != null) return false;
        if (hitName != null ? !hitName.equals(that.getHitName()) : that.getHitName() != null) return false;
        if (percentIdentity != null ? !percentIdentity.equals(that.getPercentIdentity()) : that.getPercentIdentity() != null)
            return false;
        if (score != null ? !score.equals(that.getScore()) : that.getScore() != null) return false;

        return true;
    }

    @Testable
    public int hashCode() {
        int result;
        result = (hitName != null ? hitName.hashCode() : 0);
        result = 31 * result + hitStart;
        result = 31 * result + hitEnd;
        result = 31 * result + hitStrand;
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (eValue != null ? eValue.hashCode() : 0);
        result = 31 * result + (percentIdentity != null ? percentIdentity.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "AlignmentHitImpl{" +
                "hitName='" + hitName + '\'' +
                ", hitStart=" + hitStart +
                ", hitEnd=" + hitEnd +
                ", hitStrand=" + hitStrand +
                ", score=" + score +
                ", eValue=" + eValue +
                ", percentIdentity=" + percentIdentity +
                '}';
    }
}
