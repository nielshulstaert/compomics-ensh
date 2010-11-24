package com.compomics.ensh.core.model;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 12:58:08<br>
 */
public interface ObjectXref {

    Xref getXref();

    void setXref(Xref xref);

    String getLinkageAnnotation();

    void setLinkageAnnotation(String linkageAnnotation);
}
