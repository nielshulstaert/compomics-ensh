package com.compomics.ensh.core.model.impl;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 12:23:12<br>
 */
public class ProteinAlignmentFeature extends AbstractAlignmentFeature {

    public String toString() {
        return "ProteinAlignmentFeature{" +
                "analysis=" + analysis.getLogicName() +
                ", location=" + location +
                '}';
    }
}
