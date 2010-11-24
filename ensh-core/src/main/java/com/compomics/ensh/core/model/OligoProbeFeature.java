package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 17:42:24<br>
 */
public interface OligoProbeFeature extends StrandedFeature {

    int getMismatches();

    void setMismatches(int mismatches);

    int getOligoProbeId();

    void setOligoProbeId(int oligoProbeId);

}
