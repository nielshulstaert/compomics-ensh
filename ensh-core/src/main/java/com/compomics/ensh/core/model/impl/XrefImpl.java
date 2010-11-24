package com.compomics.ensh.core.model.impl;

import test.Testable;
import com.compomics.ensh.core.model.ExternalDB;
import com.compomics.ensh.core.model.Xref;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 26-Sep-2007<br>
 * Time: 19:34:05<br>
 */
public class XrefImpl implements Xref {

    private int id;
    private ExternalDB externalDb;
    private String dbPrimaryAccession;
    private String displayLabel;
    private int version;
    private String description;
    private String infoType;
    private String infoText;
    private Set<String> synonyms;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getDbPrimaryAccession() {
        return dbPrimaryAccession;
    }

    @Testable
    public void setDbPrimaryAccession(String dbPrimaryAccession) {
        this.dbPrimaryAccession = dbPrimaryAccession;
    }

    @Testable
    public String getDisplayLabel() {
        return displayLabel;
    }

    @Testable
    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }

    @Testable
    public int getVersion() {
        return version;
    }

    @Testable
    public void setVersion(int version) {
        this.version = version;
    }

    @Testable
    public String getDescription() {
        return description;
    }

    @Testable
    public void setDescription(String description) {
        this.description = description;
    }

    @Testable
    public String getInfoType() {
        return infoType;
    }

    @Testable
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    @Testable
    public String getInfoText() {
        return infoText;
    }

    @Testable
    public void setInfoText(String infoText) {
        this.infoText = infoText;
    }

    @Testable
    public ExternalDB getExternalDb() {
        return externalDb;
    }

    @Testable
    public void setExternalDb(ExternalDB externalDb) {
        this.externalDb = externalDb;
    }

    @Testable
    public Set<String> getSynonyms() {
        return synonyms;
    }

    @Testable
    public void setSynonyms(Set<String> synonyms) {
        this.synonyms = synonyms;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XrefImpl xref = (XrefImpl) o;

        if (version != xref.version) return false;
        if (!dbPrimaryAccession.equals(xref.dbPrimaryAccession)) return false;
        if (!externalDb.equals(xref.externalDb)) return false;
        if (infoText != null ? !infoText.equals(xref.infoText) : xref.infoText != null) return false;
        if (infoType != null ? !infoType.equals(xref.infoType) : xref.infoType != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = externalDb.hashCode();
        result = 31 * result + dbPrimaryAccession.hashCode();
        result = 31 * result + version;
        result = 31 * result + (infoType != null ? infoType.hashCode() : 0);
        result = 31 * result + (infoText != null ? infoText.hashCode() : 0);
        return result;
    }

    
}
