package com.compomics.ensh.core.model.impl;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 12:05:23<br>
 */
public class SimpleFeature extends AbstractStrandedFeature {

    private String displayLabel;
    private Double score;

    @Testable
    public String getDisplayLabel() {
        return displayLabel;
    }

    @Testable
    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }

    @Testable
    public Double getScore() {
        return score;
    }

    @Testable
    public void setScore(Double score) {
        this.score = score;
    }


    public String toString() {
        return "SimpleFeature{" +
           "analysis=" + analysis.getLogicName() +
                ", location=" + location +
                '}';
    }
}
