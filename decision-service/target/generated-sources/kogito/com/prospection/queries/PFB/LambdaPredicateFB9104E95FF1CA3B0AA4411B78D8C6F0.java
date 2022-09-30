package com.prospection.queries.PFB;

import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;
import com.prospection.model.Server;
import com.prospection.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateFB9104E95FF1CA3B0AA4411B78D8C6F0 implements org.drools.model.functions.Predicate2<com.prospection.model.Server, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4447B337FEC838003021BAE5E4111B16";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(com.prospection.model.Server _this, Integer requiredDiskSpace) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getDiskSpace(), requiredDiskSpace);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("diskSpace < requiredDiskSpace");
        info.addRuleNames("ValidateDiskSpace", "/Users/tanbt/Documents/workspaces/prospection-sample-master/decision-service/src/main/resources/ServerValiadation.drl");
        return info;
    }
}
