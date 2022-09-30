package com.prospection.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.prospection.model.Server;
import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;
import org.drools.model.Query;

public class RulesB971395CFAAA21B288F92F1ED46D3348_ProspectionUnit extends RulesB971395CFAAA21B288F92F1ED46D3348 {

    @Override
    public String getName() {
        return super.getName() + ".ProspectionUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.model.codegen.execmodel.generator.DRLIdGenerator@44733f92
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesB971395CFAAA21B288F92F1ED46D3348_ProspectionUnitRuleMethods0.rule_ValidateProcessors(),
                                       RulesB971395CFAAA21B288F92F1ED46D3348_ProspectionUnitRuleMethods0.rule_ValidateMemory(),
                                       RulesB971395CFAAA21B288F92F1ED46D3348_ProspectionUnitRuleMethods0.rule_ValidateDiskSpace());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_FindFailedServers = query_FindFailedServers();

    final Query query_FindPassedServers = query_FindPassedServers();

    final Query query_FindAllServers = query_FindAllServers();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_FindFailedServers() {
        final org.drools.model.Variable<com.prospection.model.Server> var_$server = D.declarationOf(com.prospection.model.Server.class,
                                                                                                    DomainClassesMetadataB971395CFAAA21B288F92F1ED46D3348.com_prospection_model_Server_Metadata_INSTANCE,
                                                                                                    "$server",
                                                                                                    D.entryPoint("servers"));
        org.drools.model.Query FindFailedServers_build = queryDef_FindFailedServers.build(D.pattern(var_$server,
                                                                                                    D.entryPoint("servers")).expr("GENERATED_6F0CD19E098E4644420F30503E12DBE5",
                                                                                                                                  com.prospection.queries.PAA.LambdaPredicateAAC763D7D42A3E94DA9C3BB9A29D0B5E.INSTANCE,
                                                                                                                                  D.reactOn("validated")));
        return FindFailedServers_build;
    }

    private org.drools.model.Query query_FindPassedServers() {
        final org.drools.model.Variable<com.prospection.model.Server> var_$server = D.declarationOf(com.prospection.model.Server.class,
                                                                                                    DomainClassesMetadataB971395CFAAA21B288F92F1ED46D3348.com_prospection_model_Server_Metadata_INSTANCE,
                                                                                                    "$server",
                                                                                                    D.entryPoint("servers"));
        org.drools.model.Query FindPassedServers_build = queryDef_FindPassedServers.build(D.pattern(var_$server,
                                                                                                    D.entryPoint("servers")).expr("GENERATED_A396050F4FE3526AC57B5F738F95978B",
                                                                                                                                  com.prospection.queries.PA2.LambdaPredicateA2999DE0177D18518F4528CECB44DEB4.INSTANCE,
                                                                                                                                  D.reactOn("validated")));
        return FindPassedServers_build;
    }

    private org.drools.model.Query query_FindAllServers() {
        final org.drools.model.Variable<com.prospection.model.Server> var_$server = D.declarationOf(com.prospection.model.Server.class,
                                                                                                    DomainClassesMetadataB971395CFAAA21B288F92F1ED46D3348.com_prospection_model_Server_Metadata_INSTANCE,
                                                                                                    "$server",
                                                                                                    D.entryPoint("servers"));
        org.drools.model.Query FindAllServers_build = queryDef_FindAllServers.build(D.pattern(var_$server,
                                                                                              D.entryPoint("servers")));
        return FindAllServers_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_FindFailedServers);
        queries.add(query_FindPassedServers);
        queries.add(query_FindAllServers);
    }
}
