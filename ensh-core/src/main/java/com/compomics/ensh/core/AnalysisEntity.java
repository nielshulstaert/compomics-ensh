package com.compomics.ensh.core;

import java.sql.Timestamp;

/**
 * This class is a
 */
public class AnalysisEntity {
    private short iAnalysisId;

    public short getAnalysisId() {
        return iAnalysisId;
    }

    public void setAnalysisId(short aAnalysisId) {
        iAnalysisId = aAnalysisId;
    }

    private Timestamp iCreated;

    public Timestamp getCreated() {
        return iCreated;
    }

    public void setCreated(Timestamp aCreated) {
        iCreated = aCreated;
    }

    private String iLogicName;

    public String getLogicName() {
        return iLogicName;
    }

    public void setLogicName(String aLogicName) {
        iLogicName = aLogicName;
    }

    private String iDb;

    public String getDb() {
        return iDb;
    }

    public void setDb(String aDb) {
        iDb = aDb;
    }

    private String iDbVersion;

    public String getDbVersion() {
        return iDbVersion;
    }

    public void setDbVersion(String aDbVersion) {
        iDbVersion = aDbVersion;
    }

    private String iDbFile;

    public String getDbFile() {
        return iDbFile;
    }

    public void setDbFile(String aDbFile) {
        iDbFile = aDbFile;
    }

    private String iProgram;

    public String getProgram() {
        return iProgram;
    }

    public void setProgram(String aProgram) {
        iProgram = aProgram;
    }

    private String iProgramVersion;

    public String getProgramVersion() {
        return iProgramVersion;
    }

    public void setProgramVersion(String aProgramVersion) {
        iProgramVersion = aProgramVersion;
    }

    private String iProgramFile;

    public String getProgramFile() {
        return iProgramFile;
    }

    public void setProgramFile(String aProgramFile) {
        iProgramFile = aProgramFile;
    }

    private String iParameters;

    public String getParameters() {
        return iParameters;
    }

    public void setParameters(String aParameters) {
        iParameters = aParameters;
    }

    private String iModule;

    public String getModule() {
        return iModule;
    }

    public void setModule(String aModule) {
        iModule = aModule;
    }

    private String iModuleVersion;

    public String getModuleVersion() {
        return iModuleVersion;
    }

    public void setModuleVersion(String aModuleVersion) {
        iModuleVersion = aModuleVersion;
    }

    private String iGffSource;

    public String getGffSource() {
        return iGffSource;
    }

    public void setGffSource(String aGffSource) {
        iGffSource = aGffSource;
    }

    private String iGffFeature;

    public String getGffFeature() {
        return iGffFeature;
    }

    public void setGffFeature(String aGffFeature) {
        iGffFeature = aGffFeature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnalysisEntity that = (AnalysisEntity) o;

        if (iAnalysisId != that.iAnalysisId) return false;
        if (iCreated != null ? !iCreated.equals(that.iCreated) : that.iCreated != null) return false;
        if (iDb != null ? !iDb.equals(that.iDb) : that.iDb != null) return false;
        if (iDbFile != null ? !iDbFile.equals(that.iDbFile) : that.iDbFile != null) return false;
        if (iDbVersion != null ? !iDbVersion.equals(that.iDbVersion) : that.iDbVersion != null) return false;
        if (iGffFeature != null ? !iGffFeature.equals(that.iGffFeature) : that.iGffFeature != null) return false;
        if (iGffSource != null ? !iGffSource.equals(that.iGffSource) : that.iGffSource != null) return false;
        if (iLogicName != null ? !iLogicName.equals(that.iLogicName) : that.iLogicName != null) return false;
        if (iModule != null ? !iModule.equals(that.iModule) : that.iModule != null) return false;
        if (iModuleVersion != null ? !iModuleVersion.equals(that.iModuleVersion) : that.iModuleVersion != null)
            return false;
        if (iParameters != null ? !iParameters.equals(that.iParameters) : that.iParameters != null) return false;
        if (iProgram != null ? !iProgram.equals(that.iProgram) : that.iProgram != null) return false;
        if (iProgramFile != null ? !iProgramFile.equals(that.iProgramFile) : that.iProgramFile != null) return false;
        if (iProgramVersion != null ? !iProgramVersion.equals(that.iProgramVersion) : that.iProgramVersion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int lresult = (int) iAnalysisId;
        lresult = 31 * lresult + (iCreated != null ? iCreated.hashCode() : 0);
        lresult = 31 * lresult + (iLogicName != null ? iLogicName.hashCode() : 0);
        lresult = 31 * lresult + (iDb != null ? iDb.hashCode() : 0);
        lresult = 31 * lresult + (iDbVersion != null ? iDbVersion.hashCode() : 0);
        lresult = 31 * lresult + (iDbFile != null ? iDbFile.hashCode() : 0);
        lresult = 31 * lresult + (iProgram != null ? iProgram.hashCode() : 0);
        lresult = 31 * lresult + (iProgramVersion != null ? iProgramVersion.hashCode() : 0);
        lresult = 31 * lresult + (iProgramFile != null ? iProgramFile.hashCode() : 0);
        lresult = 31 * lresult + (iParameters != null ? iParameters.hashCode() : 0);
        lresult = 31 * lresult + (iModule != null ? iModule.hashCode() : 0);
        lresult = 31 * lresult + (iModuleVersion != null ? iModuleVersion.hashCode() : 0);
        lresult = 31 * lresult + (iGffSource != null ? iGffSource.hashCode() : 0);
        lresult = 31 * lresult + (iGffFeature != null ? iGffFeature.hashCode() : 0);
        return lresult;
    }
}
