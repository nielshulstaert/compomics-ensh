package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 12-Oct-2007<br>
 * Time: 09:34:00<br>
 */
public interface Karyotype extends Locatable {
    Location getLocation();

    void setLocation(Location location);

    String getBand();

    void setBand(String band);

    String getStain();

    void setStain(String stain);
}
