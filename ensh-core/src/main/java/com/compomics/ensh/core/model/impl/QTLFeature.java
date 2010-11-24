package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.QTL;
import test.Testable;


/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 11:54:31<br>
 */
public class QTLFeature extends AbstractFeature {

    private QTL qtl;

    @Testable
    public QTL getQtl() {
        return qtl;
    }

    @Testable
    public void setQtl(QTL qtl) {
        this.qtl = qtl;
    }


    public String toString() {
        return "QTLFeature{" +
                   "analysis=" + analysis.getLogicName() +
                ", location=" + location +
                '}';
    }
}
