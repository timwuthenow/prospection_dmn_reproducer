package com.prospection.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.prospection.model.Server;
import static com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348.*;

public class RulesB971395CFAAA21B288F92F1ED46D3348_ProspectionUnitRuleMethods0 {

    /**
     * Rule name: ValidateProcessors
     */
    public static org.drools.model.Rule rule_ValidateProcessors() {
        final org.drools.model.Variable<com.prospection.model.Server> var_$server = D.declarationOf(com.prospection.model.Server.class,
                                                                                                    DomainClassesMetadataB971395CFAAA21B288F92F1ED46D3348.com_prospection_model_Server_Metadata_INSTANCE,
                                                                                                    "$server",
                                                                                                    D.entryPoint("servers"));
        org.drools.model.Rule rule = D.rule("com.prospection.queries",
                                            "ValidateProcessors")
                                      .unit(com.prospection.queries.ProspectionUnit.class)
                                      .build(D.pattern(var_$server).expr("GENERATED_9E1E0F4ECEA71F040AD2B461767D06C8",
                                                                         var_requiredNumberOfProcessors,
                                                                         com.prospection.queries.PB6.LambdaPredicateB616A2CC996FE53C3901A07DD6B4533C.INSTANCE,
                                                                         D.reactOn("numberOfProcessors")),
                                             D.on(var_$server).execute(com.prospection.queries.PAC.LambdaConsequenceAC15A47541E9067D135A44D1E4B90F6F.INSTANCE));
        return rule;
    }

    /**
     * Rule name: ValidateMemory
     */
    public static org.drools.model.Rule rule_ValidateMemory() {
        final org.drools.model.Variable<com.prospection.model.Server> var_$server = D.declarationOf(com.prospection.model.Server.class,
                                                                                                    DomainClassesMetadataB971395CFAAA21B288F92F1ED46D3348.com_prospection_model_Server_Metadata_INSTANCE,
                                                                                                    "$server",
                                                                                                    D.entryPoint("servers"));
        org.drools.model.Rule rule = D.rule("com.prospection.queries",
                                            "ValidateMemory")
                                      .unit(com.prospection.queries.ProspectionUnit.class)
                                      .build(D.pattern(var_$server).expr("GENERATED_02468C3E161664579A8DB12531DCDD5D",
                                                                         var_requiredMemory,
                                                                         com.prospection.queries.P60.LambdaPredicate60DE441BA5EC4029349DD3491539B2BF.INSTANCE,
                                                                         D.reactOn("memory")),
                                             D.on(var_$server).execute(com.prospection.queries.PCD.LambdaConsequenceCD39E231EC830D0C4ABEF69CDCD93F8E.INSTANCE));
        return rule;
    }

    /**
     * Rule name: ValidateDiskSpace
     */
    public static org.drools.model.Rule rule_ValidateDiskSpace() {
        final org.drools.model.Variable<com.prospection.model.Server> var_$server = D.declarationOf(com.prospection.model.Server.class,
                                                                                                    DomainClassesMetadataB971395CFAAA21B288F92F1ED46D3348.com_prospection_model_Server_Metadata_INSTANCE,
                                                                                                    "$server",
                                                                                                    D.entryPoint("servers"));
        org.drools.model.Rule rule = D.rule("com.prospection.queries",
                                            "ValidateDiskSpace")
                                      .unit(com.prospection.queries.ProspectionUnit.class)
                                      .build(D.pattern(var_$server).expr("GENERATED_AC7A9BD91C01A08F4E98017A069352F3",
                                                                         var_requiredDiskSpace,
                                                                         com.prospection.queries.PFB.LambdaPredicateFB9104E95FF1CA3B0AA4411B78D8C6F0.INSTANCE,
                                                                         D.reactOn("diskSpace")),
                                             D.on(var_$server).execute(com.prospection.queries.PDA.LambdaConsequenceDA93A68B718CF1AD3298F5031510965A.INSTANCE));
        return rule;
    }
}
