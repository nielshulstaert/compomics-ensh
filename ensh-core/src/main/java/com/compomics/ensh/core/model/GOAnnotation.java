package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.ObjectXref;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 11-Oct-2007<br>
 * Time: 14:16:40<br>
 */
public interface GOAnnotation extends ObjectXref {

    String getEvidenceCode();

    void setEvidenceCode(String evidenceCode);

    Xref getSource();

    void setSource(Xref source);
}
