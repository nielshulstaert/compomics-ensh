package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.AlignmentFeature;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 03-Oct-2007<br>
 * Time: 12:15:20<br>
 */
public class SupportingFeature {

    public AlignmentFeature alignmentFeature;

    @Testable
    public AlignmentFeature getAlignmentFeature() {
        return alignmentFeature;
    }

    @Testable
    public void setAlignmentFeature(AlignmentFeature alignmentFeature) {
        this.alignmentFeature = alignmentFeature;
    }
}
