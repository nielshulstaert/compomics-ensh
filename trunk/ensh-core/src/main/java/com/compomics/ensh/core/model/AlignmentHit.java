package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 18:04:07<br>
 */
public interface AlignmentHit {

    String getHitName();

    void setHitName(String hitName);

    int getHitStart();

    void setHitStart(int hitStart);

    int getHitEnd();

    void setHitEnd(int hitEnd);

    int getHitStrand();

    void setHitStrand(int hitStrand);

    Double getScore();

    void setScore(Double score);

    Double getEValue();

    void setEValue(Double eValue);

    Float getPercentIdentity();

    void setPercentIdentity(Float percentIdentity);
}
