package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.QTL;
import com.compomics.ensh.core.model.QTLSynonym;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 10:11:45<br>
 */
public class QTLSynonymImpl implements QTLSynonym {

    private int id;
    private QTL qtl;
    private String sourceDatabase;
    private String sourcePrimaryId;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public QTL getQtl() {
        return qtl;
    }

    @Testable
    public void setQtl(QTL qtl) {
        this.qtl = qtl;
    }

    @Testable
    public String getSourceDatabase() {
        return sourceDatabase;
    }

    @Testable
    public void setSourceDatabase(String sourceDatabase) {
        this.sourceDatabase = sourceDatabase;
    }

    @Testable
    public String getSourcePrimaryId() {
        return sourcePrimaryId;
    }

    @Testable
    public void setSourcePrimaryId(String sourcePrimaryId) {
        this.sourcePrimaryId = sourcePrimaryId;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QTLSynonymImpl that = (QTLSynonymImpl) o;

        if (!qtl.equals(that.qtl)) return false;
        if (!sourceDatabase.equals(that.sourceDatabase)) return false;
        if (!sourcePrimaryId.equals(that.sourcePrimaryId)) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = qtl.hashCode();
        result = 31 * result + sourceDatabase.hashCode();
        result = 31 * result + sourcePrimaryId.hashCode();
        return result;
    }

    public String toString() {
        return  sourceDatabase + ":" + sourcePrimaryId;
    }
}
