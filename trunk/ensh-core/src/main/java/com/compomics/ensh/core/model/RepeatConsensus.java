package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 18:56:14<br>
 */
public interface RepeatConsensus {
    String getName();

    void setName(String name);

    String getRepeatClass();

    void setRepeatClass(String repeatClass);

    String getType();

    void setType(String type);

    String getConsensus();

    void setConsensus(String consensus);
}
