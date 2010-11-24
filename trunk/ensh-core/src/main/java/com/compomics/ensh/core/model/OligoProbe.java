package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 17:46:27<br>
 */
public interface OligoProbe {
    int getProbeId();

    void setProbeId(int probeId);

    int getArrayId();

    void setArrayId(int arrayId);

    OligoArray getArray();

    void setArray(OligoArray array);

    String getProbesetId();

    void setProbesetId(String probesetId);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getLength();

    void setLength(String length);
}
