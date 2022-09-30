package com.prospection.queries.P60;

import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;
import com.prospection.model.Server;
import com.prospection.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate60DE441BA5EC4029349DD3491539B2BF implements org.drools.model.functions.Predicate2<com.prospection.model.Server, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "98592662FC967C8F88C05C39AAACD870";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.prospection.model.Server _this, Integer requiredMemory) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getMemory(), requiredMemory);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("memory < requiredMemory");
        info.addRuleNames("ValidateMemory", "/Users/tanbt/Documents/workspaces/prospection-sample-master/decision-service/src/main/resources/ServerValiadation.drl");
        return info;
    }
}
