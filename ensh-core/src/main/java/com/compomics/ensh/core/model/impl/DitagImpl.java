package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.Ditag;

import java.util.Set;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 14:18:13<br>
 */
public class DitagImpl implements Ditag {

    private int id;
    private String name;
    private String type;
    private int tagCount;
    private String sequence;
    private Set<DitagFeature> genomeLocations;

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
    public String getType() {
        return type;
    }

    @Testable
    public void setType(String type) {
        this.type = type;
    }

    @Testable
    public int getTagCount() {
        return tagCount;
    }

    @Testable
    public void setTagCount(int tagCount) {
        this.tagCount = tagCount;
    }

    @Testable
    public String getSequence() {
        return sequence;
    }

    @Testable
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Testable
    public Set<DitagFeature> getGenomeLocations() {
        return genomeLocations;
    }

    @Testable
    public void setGenomeLocations(Set<DitagFeature> genomeLocations) {
        this.genomeLocations = genomeLocations;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Ditag)) return false;

        Ditag ditag = (Ditag) o;

        if (tagCount != ditag.getTagCount()) return false;
        if (!name.equals(ditag.getName())) return false;
        if (!sequence.equals(ditag.getSequence())) return false;
        if (!type.equals(ditag.getType())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = name.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + tagCount;
        result = 31 * result + sequence.hashCode();
        return result;
    }


    public String toString() {
        return "DitagImpl{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", tagCount=" + tagCount +
                ", sequence='" + sequence + '\'' +
                '}';
    }
}
