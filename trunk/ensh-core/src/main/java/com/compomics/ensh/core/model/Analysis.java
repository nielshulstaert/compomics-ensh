package com.compomics.ensh.core.model;

import com.compomics.ensh.core.model.impl.AnalysisDescriptionImpl;

/**
 * Created by IntelliJ IDEA.<br>
 * User: mmueller<br>
 * Date: 02-Oct-2007<br>
 * Time: 10:44:45<br>
 */
public interface Analysis {


    String getLogicName();

    void setLogicName(String logicName);

    String getDatabase();

    void setDatabase(String database);

    String getDatabaseVersion();

    void setDatabaseVersion(String databaseVersion);

    String getDatabaseFile();

    void setDatabaseFile(String databaseFile);

    String getProgram();

    void setProgram(String program);

    String getProgramVersion();

    void setProgramVersion(String programVersion);

    String getProgramFile();

    void setProgramFile(String programFile);

    String getParameters();

    void setParameters(String parameters);

    String getModule();

    void setModule(String module);

    String getModuleVersion();

    void setModuleVersion(String moduleVersion);

    String getGffSource();

    void setGffSource(String gffSource);

    String getGffFeature();

    void setGffFeature(String gffFeature);

    AnalysisDescription getDescription();

    void setDescription(AnalysisDescription description);
}
