package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.RepeatConsensus;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 11:16:19<br>
 */
public class RepeatConsensusImpl implements RepeatConsensus {

    private int id;
    private String name;
    private String repeatClass;
    private String type;
    private String consensus;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getName() {
        return name;
    }

    @Testable
    public void setName(String name) {
        this.name = name;
    }

    @Testable
    public String getRepeatClass() {
        return repeatClass;
    }

    @Testable
    public void setRepeatClass(String repeatClass) {
        this.repeatClass = repeatClass;
    }

    @Testable
    public String getType() {
        return type;
    }

    @Testable
    public void setType(String type) {
        this.type = type;
    }

    @Testable
    public String getConsensus() {
        return consensus;
    }

    @Testable
    public void setConsensus(String consensus) {
        this.consensus = consensus;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof RepeatConsensus)) return false;

        RepeatConsensus that = (RepeatConsensus) o;

        if (!name.equals(that.getName())) return false;
        if (!repeatClass.equals(that.getRepeatClass())) return false;
        if (!type.equals(that.getType())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = name.hashCode();
        result = 31 * result + repeatClass.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }


    public String toString() {
        return "RepeatConsensusImpl{" +
                "name='" + name + '\'' +
                ", repeatClass='" + repeatClass + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
