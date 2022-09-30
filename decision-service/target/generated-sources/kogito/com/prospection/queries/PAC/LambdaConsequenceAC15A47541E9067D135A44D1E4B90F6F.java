package com.prospection.queries.PAC;

import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;
import com.prospection.model.Server;
import com.prospection.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceAC15A47541E9067D135A44D1E4B90F6F implements org.drools.model.functions.Block1<com.prospection.model.Server>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "D682ECE163786CE9322212802E20F27C";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.prospection.model.Server $server) throws java.lang.Exception {
        $server.markAsInvalid("Low number of processors");
    }
}
