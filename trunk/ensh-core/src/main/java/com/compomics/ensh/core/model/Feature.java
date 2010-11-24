package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 10:36:26<br>
 */
public interface Feature<L extends Location> extends Locatable<L> {

    int getId();

    void setId(int id);

    Analysis getAnalysis();

    void setAnalysis(Analysis analysis);

}
