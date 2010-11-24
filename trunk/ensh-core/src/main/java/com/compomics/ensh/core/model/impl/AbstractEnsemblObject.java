package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.EnsemblObject;
import com.compomics.ensh.core.model.StableID;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 18:02:29<br>
 */
public class AbstractEnsemblObject implements EnsemblObject {

    protected int id;
    protected StableID stableId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StableID getStableId() {
        return stableId;
    }

    public void setStableId(StableID stableId) {
        this.stableId = stableId;
    }

    public int compareTo(EnsemblObject that) {

        if(this == that) return 0;
        return this.getStableId().compareTo(that.getStableId());

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnsemblObject)) return false;

        AbstractEnsemblObject that = (AbstractEnsemblObject) o;

        if (!stableId.equals(that.getStableId())) return false;

        return true;
    }

    public int hashCode() {
        return stableId.hashCode();
    }

    public String toString() {
        return this.getStableId().toString();                
    }
}
