package com.prospection.queries.PAA;

import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;
import com.prospection.model.Server;
import com.prospection.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateAAC763D7D42A3E94DA9C3BB9A29D0B5E implements org.drools.model.functions.Predicate1<com.prospection.model.Server>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "6379285B5CF4B0DC41C9502DF56EE41B";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.prospection.model.Server _this) throws java.lang.Exception {
        return !_this.isValidated();
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("!validated");
        info.addRuleNames("FindFailedServers", "/Users/tanbt/Documents/workspaces/prospection-sample-master/decision-service/src/main/resources/ServerValiadation.drl");
        return info;
    }
}
