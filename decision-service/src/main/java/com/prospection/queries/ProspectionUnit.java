package com.prospection.queries;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

import com.prospection.model.Server;

public class ProspectionUnit implements RuleUnitData {

    private int requiredNumberOfProcessors;
    private int requiredMemory;
    private int requiredDiskSpace;
    private DataStore<Server> servers;

    public ProspectionUnit() {
        this(DataSource.createStore());
    }

    public ProspectionUnit(DataStore<Server> servers) {
        this.servers = servers;
    }

    public int getRequiredNumberOfProcessors() {
        return this.requiredNumberOfProcessors;
    }

    public int getRequiredMemory() {
        return this.requiredMemory;
    }

    public int getRequiredDiskSpace() {
        return this.requiredDiskSpace;
    }

    public DataStore<Server> getServers() {
        return servers;
    }

    public void setServers(DataStore<Server> servers) {
        this.servers = servers;
    }
}
