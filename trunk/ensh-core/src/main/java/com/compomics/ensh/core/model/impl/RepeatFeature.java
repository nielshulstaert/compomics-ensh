package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.RepeatConsensus;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 11:15:52<br>
 */
public class RepeatFeature extends AbstractStrandedFeature {

    private RepeatConsensus repeatConsensus;
    private int repeatStart;
    private int repeatEnd;
    private Double score;

    @Testable
    public RepeatConsensus getRepeatConsensus() {
        return repeatConsensus;
    }

    @Testable
    public void setRepeatConsensus(RepeatConsensus repeatConsensus) {
        this.repeatConsensus = repeatConsensus;
    }

    @Testable
    public int getRepeatStart() {
        return repeatStart;
    }

    @Testable
    public void setRepeatStart(int repeatStart) {
        this.repeatStart = repeatStart;
    }

    @Testable
    public int getRepeatEnd() {
        return repeatEnd;
    }

    @Testable
    public void setRepeatEnd(int repeatEnd) {
        this.repeatEnd = repeatEnd;
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
        return "RepeatFeature{" +
                 "analysis=" + analysis.getLogicName() +
                ", location=" + location +
                '}';
    }
}
