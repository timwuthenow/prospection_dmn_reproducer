package com.prospection.queries.PB6;

import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;
import com.prospection.model.Server;
import com.prospection.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateB616A2CC996FE53C3901A07DD6B4533C implements org.drools.model.functions.Predicate2<com.prospection.model.Server, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "94453F126B6CF8D425EF020C550C6616";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.prospection.model.Server _this, Integer requiredNumberOfProcessors) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getNumberOfProcessors(), requiredNumberOfProcessors);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("numberOfProcessors < requiredNumberOfProcessors");
        info.addRuleNames("ValidateProcessors", "/Users/tanbt/Documents/workspaces/prospection-sample-master/decision-service/src/main/resources/ServerValiadation.drl");
        return info;
    }
}
