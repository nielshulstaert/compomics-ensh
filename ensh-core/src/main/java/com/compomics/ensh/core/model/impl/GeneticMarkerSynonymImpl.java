package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.GeneticMarker;
import com.compomics.ensh.core.model.GeneticMarkerSynonym;

import java.io.Serializable;

import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 28-Sep-2007<br>
 * Time: 15:23:32<br>
 */
public class GeneticMarkerSynonymImpl implements Serializable, GeneticMarkerSynonym {

    private int id;
    private GeneticMarker marker;
    private String source;
    private String name;


    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public GeneticMarker getMarker() {
        return marker;
    }

    @Testable
    public void setMarker(GeneticMarker marker) {
        this.marker = marker;
    }

    @Testable
    public String getSource() {
        return source;
    }

    @Testable
    public void setSource(String source) {
        this.source = source;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(!(o instanceof GeneticMarkerSynonym)) return false;

        GeneticMarkerSynonym that = (GeneticMarkerSynonym) o;

        if (name != null ? !name.equals(that.getName()) : that.getName() != null) return false;
        if (source != null ? !source.equals(that.getSource()) : that.getSource() != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (source != null ? source.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String toString() {
        return source + ":" +  name;
    }
}
