package com.prospection.queries.PDA;

import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;
import com.prospection.model.Server;
import com.prospection.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceDA93A68B718CF1AD3298F5031510965A implements org.drools.model.functions.Block1<com.prospection.model.Server>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "543AC085ABA256A13BFC54BB79AE1193";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.prospection.model.Server $server) throws java.lang.Exception {
        $server.markAsInvalid("Low disk space");
    }
}
