package com.prospection.queries.PCD;

import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;
import com.prospection.model.Server;
import com.prospection.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceCD39E231EC830D0C4ABEF69CDCD93F8E implements org.drools.model.functions.Block1<com.prospection.model.Server>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4BE1F82F5AC9C963D64EF7F8CD5AD6CB";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(com.prospection.model.Server $server) throws java.lang.Exception {
        $server.markAsInvalid("Low memory");
    }
}
