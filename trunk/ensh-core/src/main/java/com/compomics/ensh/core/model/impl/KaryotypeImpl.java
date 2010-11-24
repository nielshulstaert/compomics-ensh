package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.Locatable;
import com.compomics.ensh.core.model.Location;
import com.compomics.ensh.core.model.Karyotype;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 15:40:25<br>
 */
public class KaryotypeImpl implements Karyotype {

    private int id;
    private String band;
    private String stain;
    private Location location;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public Location getLocation() {
        return location;
    }

    @Testable
    public void setLocation(Location location) {
        this.location = location;
    }

    @Testable
    public String getBand() {
        return band;
    }

    @Testable
    public void setBand(String band) {
        this.band = band;
    }

    @Testable
    public String getStain() {
        return stain;
    }

    @Testable
    public void setStain(String stain) {
        this.stain = stain;
    }
      
    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof KaryotypeImpl)) return false;

        Karyotype karyotype = (Karyotype) o;

        if (!band.equals(karyotype.getBand())) return false;
        if (!location.equals(karyotype.getLocation())) return false;
        if (!stain.equals(karyotype.getStain())) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = band.hashCode();
        result = 31 * result + stain.hashCode();
        result = 31 * result + location.hashCode();
        return result;
    }


    public String toString() {
        return "Band " + band + "(" + stain + "): " + location;
    }
}
