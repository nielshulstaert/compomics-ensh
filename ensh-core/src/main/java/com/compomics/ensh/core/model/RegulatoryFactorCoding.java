package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 18:46:01<br>
 */
public interface RegulatoryFactorCoding extends RegulatoryFactor {
    Transcript getTranscript();

    void setTranscript(Transcript transcript);

    Gene getGene();

    void setGene(Gene gene);
}
