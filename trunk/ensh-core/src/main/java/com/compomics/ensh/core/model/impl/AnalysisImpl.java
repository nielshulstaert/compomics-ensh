package com.compomics.ensh.core.model.impl;

import com.compomics.ensh.core.model.AnalysisDescription;
import com.compomics.ensh.core.model.Analysis;
import test.Testable;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 27-Sep-2007<br>
 * Time: 16:47:28<br>
 */
public class AnalysisImpl implements Analysis {

    private int id;
    private String logicName;
    private String database;
    private String databaseVersion;
    private String databaseFile;
    private String program;
    private String programVersion;
    private String programFile;
    private String parameters;
    private String module;
    private String moduleVersion;
    private String gffSource;
    private String gffFeature;
    private AnalysisDescription description;

    @Testable
    public int getId() {
        return id;
    }

    @Testable
    public void setId(int id) {
        this.id = id;
    }

    @Testable
    public String getLogicName() {
        return logicName;
    }

    @Testable
    public void setLogicName(String logicName) {
        this.logicName = logicName;
    }

    @Testable
    public String getDatabase() {
        if(database == null)
            return "";
        return database;
    }

    @Testable
    public void setDatabase(String database) {
        this.database = database;
    }

    @Testable
    public String getDatabaseVersion() {
        if(databaseVersion == null)
            return "";
        return databaseVersion;
    }

    @Testable
    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    @Testable
    public String getDatabaseFile() {
        if(databaseFile == null)
            return "";
        return databaseFile;
    }

    @Testable
    public void setDatabaseFile(String databaseFile) {
        this.databaseFile = databaseFile;
    }

    @Testable
    public String getProgram() {
        if(program == null)
            return "";
        return program;
    }

    @Testable
    public void setProgram(String program) {
        this.program = program;
    }

    @Testable
    public String getProgramVersion() {
        if(programVersion == null)
            return "";
        return programVersion;
    }

    @Testable
    public void setProgramVersion(String programVersion) {
        this.programVersion = programVersion;
    }

    @Testable
    public String getProgramFile() {
        if(programFile == null)
            return "";
        return programFile;
    }

    @Testable
    public void setProgramFile(String programFile) {
        this.programFile = programFile;
    }

    @Testable
    public String getParameters() {
        if(parameters == null)
            return "";
        return parameters;
    }

    @Testable
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    @Testable
    public String getModule() {
        if(module == null)
            return "";
        return module;
    }

    @Testable
    public void setModule(String module) {
        this.module = module;
    }

    @Testable
    public String getModuleVersion() {
        if(moduleVersion == null)
            return "";
        return moduleVersion;
    }

    @Testable
    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    @Testable
    public String getGffSource() {
        if(gffSource == null)
            return "";
        return gffSource;
    }

    @Testable
    public void setGffSource(String gffSource) {
        this.gffSource = gffSource;
    }

    @Testable
    public String getGffFeature() {
        if(gffFeature == null)
            return "";
        return gffFeature;
    }

    @Testable
    public void setGffFeature(String gffFeature) {
        this.gffFeature = gffFeature;
    }

    @Testable
    public AnalysisDescription getDescription() {
        if(description == null)
            description = new AnalysisDescriptionImpl();
        return description;
    }

    @Testable
    public void setDescription(AnalysisDescription description) {
        this.description = description;
    }

    @Testable
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Analysis)) return false;

        Analysis analysis = (Analysis) o;

        if (!logicName.equals(analysis.getLogicName())) return false;

        return true;
    }

    @Testable
    public int hashCode() {
        return logicName.hashCode();
    }

    public String toString() {
        return "Analysis{" +
                "logicName='" + logicName + '\'' +
                ", database='" + database + '\'' +
                ", databaseVersion='" + databaseVersion + '\'' +
                ", databaseFile='" + databaseFile + '\'' +
                ", program='" + program + '\'' +
                ", programVersion='" + programVersion + '\'' +
                ", programFile='" + programFile + '\'' +
                ", parameters='" + parameters + '\'' +
                ", module='" + module + '\'' +
                ", moduleVersion='" + moduleVersion + '\'' +
                ", gffSource='" + gffSource + '\'' +
                ", gffFeature='" + gffFeature + '\'' +
                ", description=" + description +
                '}';
    }
}
