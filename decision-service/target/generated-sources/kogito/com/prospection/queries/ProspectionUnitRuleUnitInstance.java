package com.prospection.queries;

public class ProspectionUnitRuleUnitInstance extends org.drools.ruleunits.impl.KieSessionBasedRuleUnitInstance<com.prospection.queries.ProspectionUnit> implements org.kie.kogito.rules.RuleUnitInstance<com.prospection.queries.ProspectionUnit> {

    public ProspectionUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<com.prospection.queries.ProspectionUnit> unit, com.prospection.queries.ProspectionUnit value, org.kie.api.runtime.KieSession evaluator) {
        super(unit, value, evaluator);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession evaluator, com.prospection.queries.ProspectionUnit value) {
        if (value.getServers() == null) {
            value.setServers(org.kie.kogito.rules.DataSource.createStore());
        }
        value.getServers().subscribe(new org.drools.ruleunits.impl.EntryPointDataProcessor(evaluator.getEntryPoint("servers")));
        evaluator.setGlobal("servers", value.getServers());
        evaluator.setGlobal("requiredDiskSpace", value.getRequiredDiskSpace());
        evaluator.setGlobal("requiredNumberOfProcessors", value.getRequiredNumberOfProcessors());
        evaluator.setGlobal("requiredMemory", value.getRequiredMemory());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.drools.ruleunits.api.RuleUnitQuery<Q>> query) {
        if (ProspectionUnitQueryFindFailedServers.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new ProspectionUnitQueryFindFailedServers(this);
        if (ProspectionUnitQueryFindPassedServers.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new ProspectionUnitQueryFindPassedServers(this);
        if (ProspectionUnitQueryFindAllServers.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new ProspectionUnitQueryFindAllServers(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
