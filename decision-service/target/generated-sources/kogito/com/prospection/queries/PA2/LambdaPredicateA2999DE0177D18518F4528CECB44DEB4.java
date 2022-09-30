package com.prospection.queries.PA2;

import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;
import com.prospection.model.Server;
import com.prospection.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateA2999DE0177D18518F4528CECB44DEB4 implements org.drools.model.functions.Predicate1<com.prospection.model.Server>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9DBA36D125B37211A6D1D102EE05CE93";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.prospection.model.Server _this) throws java.lang.Exception {
        return _this.isValidated();
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("validated");
        info.addRuleNames("FindPassedServers", "/Users/tanbt/Documents/workspaces/prospection-sample-master/decision-service/src/main/resources/ServerValiadation.drl");
        return info;
    }
}
