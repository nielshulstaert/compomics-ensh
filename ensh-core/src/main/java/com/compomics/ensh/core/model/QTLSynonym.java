package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 18:38:27<br>
 */
public interface QTLSynonym {
    QTL getQtl();

    void setQtl(QTL qtl);

    String getSourceDatabase();

    void setSourceDatabase(String sourceDatabase);

    String getSourcePrimaryId();

    void setSourcePrimaryId(String sourcePrimaryId);
}
