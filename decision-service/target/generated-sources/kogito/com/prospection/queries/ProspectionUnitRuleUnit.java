/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prospection.queries;

import org.drools.core.RuleBaseConfiguration;
import org.drools.core.SessionConfigurationImpl;
import org.drools.core.impl.EnvironmentImpl;
import org.drools.kiesession.rulebase.InternalKnowledgeBase;
import org.drools.ruleunits.impl.sessions.RuleUnitStatefulKnowledgeSessionImpl;
import org.kie.api.runtime.KieSession;
import org.kie.kogito.drools.core.unit.AbstractRuleUnit;
import org.kie.kogito.rules.RuleUnits;
import org.kie.kogito.rules.RuleEventListenerConfig;

@javax.inject.Singleton()
public class ProspectionUnitRuleUnit extends AbstractRuleUnit<ProspectionUnit> {

    private static final InternalKnowledgeBase kb = createKnowledgeBase();

    private final org.kie.kogito.Application app;

    @javax.inject.Inject()
    public ProspectionUnitRuleUnit(org.kie.kogito.Application app) {
        super(ProspectionUnit.class.getCanonicalName(), app.get(RuleUnits.class));
        this.app = app;
    }

    public com.prospection.queries.ProspectionUnitRuleUnitInstance internalCreateInstance(ProspectionUnit value) {
        return new com.prospection.queries.ProspectionUnitRuleUnitInstance(this, value, createLegacySession());
    }

    private KieSession createLegacySession() {
        SessionConfigurationImpl sessionConfig = new SessionConfigurationImpl();
        sessionConfig.setClockType(org.drools.core.ClockType.REALTIME_CLOCK);
        KieSession ks = kb.newKieSession(sessionConfig, new EnvironmentImpl());
        ((RuleUnitStatefulKnowledgeSessionImpl) ks).setStateless(/*$IsStateful$*/
        true);
        ((RuleUnitStatefulKnowledgeSessionImpl) ks).setRuleUnits(ruleUnits);
        org.kie.kogito.Config config = app.config();
        if (config != null) {
            RuleEventListenerConfig ruleEventListenerConfig = config.get(org.kie.kogito.rules.RuleConfig.class).ruleEventListeners();
            ruleEventListenerConfig.agendaListeners().forEach(ks::addEventListener);
            ruleEventListenerConfig.ruleRuntimeListeners().forEach(ks::addEventListener);
        }
        return ks;
    }

    private static InternalKnowledgeBase createKnowledgeBase() {
        RuleBaseConfiguration ruleBaseConfig = new RuleBaseConfiguration();
        ruleBaseConfig.setEventProcessingMode(org.kie.api.conf.EventProcessingOption.CLOUD);
        ruleBaseConfig.setSessionPoolSize(-1);
        InternalKnowledgeBase kb = org.drools.modelcompiler.KieBaseBuilder.createKieBaseFromModel(new com.prospection.queries.RulesB971395CFAAA21B288F92F1ED46D3348_ProspectionUnit(), ruleBaseConfig);
        return kb;
    }
}
