package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.SequenceRegion;
import com.compomics.ensh.core.model.CoordinateSystem;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 26-Sep-2007<br>
 * Time: 20:15:13<br>
 */
public class CoordinateSystemImpl implements CoordinateSystem {

    private int id;
    private String name;
    private String version;
    private int rank;
    private String attributes;
    private SortedSet<SequenceRegion> sequenceRegions;

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
    public String getVersion() {
        if(version == null)
            return "";
        return version;
    }

    @Testable
    public void setVersion(String version) {
        this.version = version;
    }

    @Testable
    public int getRank() {
        return rank;
    }

    @Testable
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Testable
    public String getAttributes() {
        if(attributes == null)
            return "";
        return attributes;
    }

    @Testable
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    @Testable
    public SortedSet<SequenceRegion> getSequenceRegions() {
        if(sequenceRegions == null)
            this.sequenceRegions = new TreeSet<SequenceRegion>();
        return sequenceRegions;
    }

    @Testable
    public void setSequenceRegions(SortedSet<SequenceRegion> sequenceRegions) {
        this.sequenceRegions = sequenceRegions;
    }

    @Testable
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null) return false;

        if(!(o instanceof CoordinateSystem)) return false;

        CoordinateSystem that = (CoordinateSystem) o;

        if (rank != that.getRank()) return false;
        if (!name.equals(that.getName())) return false;
        if (version != null ? !version.equals(that.getVersion()) : that.getVersion() != null) return false;

        return true;
    }

    @Testable
    public int hashCode() {
        int result;
        result = name.hashCode();
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + rank;
        return result;
    }

    public String toString() {
        if(version != null)
            return name + " (" + version + ")";
        return name;
    }


    public int compareTo(CoordinateSystem that) {

        if(this == that) return 0;

        if(this.equals(that)) return 0;
        //compare rank
        return new Integer(this.getRank()).compareTo(that.getRank());

    }
}
