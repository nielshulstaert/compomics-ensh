package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.SequenceRegion;
import com.compomics.ensh.core.model.Feature;
import com.compomics.ensh.core.model.Analysis;
import com.compomics.ensh.core.model.Location;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 10:37:00<br>
 */
public class AbstractFeature<L extends Location> implements Feature<L> {

    protected int id;
    protected L location;
    protected Analysis analysis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public L getLocation() {
        return location;
    }

    public void setLocation(L location) {
        this.location = location;
    }

    public Analysis getAnalysis() {
        return analysis;
    }

    public void setAnalysis(Analysis analysis) {
        this.analysis = analysis;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractFeature that = (AbstractFeature) o;

        if (!analysis.equals(that.analysis)) return false;
        if (!location.equals(that.location)) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = location.hashCode();
        result = 31 * result + analysis.hashCode();
        return result;
    }


    public String toString() {
        return "Feature{" +
                "analysis=" + analysis.getLogicName() +
                ", location=" + location +
                '}';
    }
}
