package com.compomics.ensh.core.model;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 13-Oct-2007<br>
 * Time: 18:54:43<br>
 */
public interface Xref {
    String getDbPrimaryAccession();

    void setDbPrimaryAccession(String dbPrimaryAccession);

    String getDisplayLabel();

    void setDisplayLabel(String displayLabel);

    int getVersion();

    void setVersion(int version);

    String getDescription();

    void setDescription(String description);

    String getInfoType();

    void setInfoType(String infoType);

    String getInfoText();

    void setInfoText(String infoText);

    ExternalDB getExternalDb();

    void setExternalDb(ExternalDB externalDb);

    Set<String> getSynonyms();

    void setSynonyms(Set<String> synonyms);
}
