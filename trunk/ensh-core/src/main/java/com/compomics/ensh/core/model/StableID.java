package com.compomics.ensh.core.model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 17:53:24<br>
 */
public interface StableID extends Comparable <StableID> {


    int getEnsemblObjectId();

    void setEnsemblObjectId(int ensemblObjectId);

    String getStableId();

    void setStableId(String stableId);

    int getVersion();

    void setVersion(Integer version);

    Date getCreatedDate();

    void setCreatedDate(Date createdDate);

    Date getModifiedDate();

    void setModifiedDate(Date modifiedDate);
}
