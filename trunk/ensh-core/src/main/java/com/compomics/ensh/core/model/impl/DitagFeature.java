package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.Ditag;
import test.Testable;


/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 14:28:20<br>
 */
public class DitagFeature extends AbstractAlignmentFeature {

    private Ditag ditag;
    private int ditagPairId;
    private String ditagSide;

    @Testable
    public Ditag getDitag() {
        return ditag;
    }

    @Testable
    public void setDitag(Ditag ditag) {
        this.ditag = ditag;
    }

    @Testable
    public int getDitagPairId() {
        return ditagPairId;
    }

    @Testable
    public void setDitagPairId(int ditagPairId) {
        this.ditagPairId = ditagPairId;
    }

    @Testable
    public String getDitagSide() {
        return ditagSide;
    }

    @Testable
    public void setDitagSide(String ditagSlide) {
        this.ditagSide = ditagSlide;
    }


    public String toString() {
        return "DitagFeature{" +
                "analysis=" + analysis.getLogicName() +
                ", location=" + location +
                '}';
    }
}
