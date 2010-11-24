package com.compomics.ensh.module.model;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 23-Nov-2007<br/>
 * Time: 18:21:46<br/>
 */
public interface ModuleSource {

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    ModuleType getModuleType();

    void setModuleType(ModuleType moduleType);

}
