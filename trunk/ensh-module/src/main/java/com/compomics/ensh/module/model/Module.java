package com.compomics.ensh.module.model;

import com.compomics.ensh.core.StableIdEventEntity;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 20-Nov-2007<br/>
 * Time: 19:21:55<br/>
 */
public interface Module {

    String getIdentifier();

    void setIdentifier(String identifier);

    StableIdEventEntity getStableId();

    void setStableId(StableIdEventEntity stableId);

    int getVersion();

    void setVersion(int version);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Set<Component> getComponents();

    void setComponents(Set<Component> components);

    ModuleType getModuleType();

    void setModuleType(ModuleType moduleType);

    ModuleSource getModuleSource();

    void setModuleSource(ModuleSource moduleSource);

    boolean addComponents(Set<Component> components);

    boolean addComponent(Component component);

    boolean removeCompenent(Component component);

    void removeAllComponents();
}
