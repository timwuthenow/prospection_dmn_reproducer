package com.prospection.queries;

import org.drools.core.common.ReteEvaluator;
import org.drools.core.impl.RuleBase;
import org.drools.modelcompiler.KieBaseBuilder;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.impl.factory.AbstractRuleUnit;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;
import org.drools.ruleunits.impl.sessions.RuleUnitExecutorImpl;

public class ProspectionUnitRuleUnit7055074714193591995 extends AbstractRuleUnit<com.prospection.queries.ProspectionUnit> {

    private static final RuleBase ruleBase = KieBaseBuilder.createKieBaseFromModel(new com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348_ProspectionUnit());

    public ProspectionUnitRuleUnit7055074714193591995() {
        super(com.prospection.queries.ProspectionUnit.class.getCanonicalName());
    }

    @Override
    public ProspectionUnitRuleUnitInstance7055074714193591995 internalCreateInstance(com.prospection.queries.ProspectionUnit data) {
        ReteEvaluator reteEvaluator = new RuleUnitExecutorImpl(ruleBase);
        return new ProspectionUnitRuleUnitInstance7055074714193591995(this,
                                                                      data,
                                                                      reteEvaluator);
    }
}
