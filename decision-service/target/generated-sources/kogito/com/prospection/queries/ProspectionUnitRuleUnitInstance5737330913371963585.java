package com.prospection.queries;

import org.drools.core.common.ReteEvaluator;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;

public class ProspectionUnitRuleUnitInstance5737330913371963585 extends ReteEvaluatorBasedRuleUnitInstance<com.prospection.queries.ProspectionUnit> {

    public ProspectionUnitRuleUnitInstance5737330913371963585(RuleUnit<com.prospection.queries.ProspectionUnit> unit, com.prospection.queries.ProspectionUnit workingMemory, ReteEvaluator reteEvaluator) {
        super(unit,
              workingMemory,
              reteEvaluator);
    }

    @Override
    protected void bind(ReteEvaluator evaluator, com.prospection.queries.ProspectionUnit ruleUnit) {
        ruleUnit.getServers()
                .subscribe(new org.drools.ruleunits.impl.EntryPointDataProcessor(evaluator.getEntryPoint("servers")));
        evaluator.setGlobal("servers",
                            ruleUnit.getServers());
        evaluator.setGlobal("requiredDiskSpace",
                            ruleUnit.getRequiredDiskSpace());
        evaluator.setGlobal("requiredNumberOfProcessors",
                            ruleUnit.getRequiredNumberOfProcessors());
        evaluator.setGlobal("requiredMemory",
                            ruleUnit.getRequiredMemory());
    }
}
