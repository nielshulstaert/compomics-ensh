package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.AnalysisImpl;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 14:07:36<br>
 */
public interface XrefIdentity extends ObjectXref {

    int getQueryIdentity();

    void setQueryIdentity(Integer queryIdentity);

    int getTargetIdentity();

    void setTargetIdentity(Integer targetIdentity);

    int getHitStart();

    void setHitStart(Integer hitStart);

    int getHitEnd();

    void setHitEnd(Integer hitEnd);

    int getTranslationStart();

    void setTranslationStart(Integer translationStart);

    int getTranslationEnd();

    void setTranslationEnd(Integer translationEnd);

    String getCigarLine();

    void setCigarLine(String cigarLine);

    double getScore();

    void setScore(Double score);

    double geteValue();

    void seteValue(Double eValue);

    Analysis getAnalysis();

    void setAnalysis(Analysis analysis);
}
