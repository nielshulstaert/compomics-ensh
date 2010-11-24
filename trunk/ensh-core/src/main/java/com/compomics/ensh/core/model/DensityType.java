package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 17:29:39<br>
 */
public interface DensityType {
    Analysis getAnalysis();

    void setAnalysis(Analysis analysis);

    int getBlockSize();

    void setBlockSize(int blockSize);

    int getRegionFeatures();

    void setRegionFeatures(int regionFeatures);

    String getValueType();

    void setValueType(String valueType);
}
