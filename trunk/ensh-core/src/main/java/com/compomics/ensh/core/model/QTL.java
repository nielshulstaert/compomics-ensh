package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.QTLSynonymImpl;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 18:28:13<br>
 */
public interface QTL {
    String getTrait();

    void setTrait(String trait);

    Float getLodScore();

    void setLodScore(Float lodScore);

    GeneticMarker getFlankingMarker1();

    void setFlankingMarker1(GeneticMarker flankingMarker1);

    GeneticMarker getFlankingMarker2();

    void setFlankingMarker2(GeneticMarker flankingMarker2);

    GeneticMarker getPeakMarker();

    void setPeakMarker(GeneticMarker peakMarker);

    Set<QTLSynonym> getSynonyms();

    void setSynonyms(Set<QTLSynonym> synonyms);
}
