package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.StrandedLocation;
import com.compomics.ensh.core.model.Locatable;
import com.compomics.ensh.core.model.Location;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 17:36:28<br>
 */
public class RegulatorySearchRegion extends AbstractStrandedFeature {

    private int id;
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
    public String getName() {
        return name;
    }

    @Testable
    public void setName(String name) {
        this.name = name;
    }

    @Testable
    public void setLocation(StrandedLocation location) {
        this.location = location;
    }

    @Testable
    public void setAnalysis(AnalysisImpl analysis) {
        this.analysis = analysis;
    }
}
