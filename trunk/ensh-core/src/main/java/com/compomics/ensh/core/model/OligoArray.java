package com.compomics.ensh.core.model;


import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 12-Oct-2007<br>
 * Time: 11:08:00<br>
 */
public interface OligoArray {

    OligoArray getParentArray();

    void setParentArray(OligoArray parentArray);

    int getProbesetSize();

    void setProbesetSize(int probesetSize);

    String getName();

    void setName(String name);

    String getType();

    void setType(String type);

    Set<OligoProbe> getProbes();

    void setProbes(Set<OligoProbe> probes);
}
