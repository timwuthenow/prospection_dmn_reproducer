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

import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.kie.kogito.rules.RuleUnit;
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

@Path("/find-all-servers")
public class ProspectionUnitQueryFindAllServersEndpoint {

    @javax.inject.Inject
    RuleUnit<com.prospection.queries.ProspectionUnit> ruleUnit;

    public ProspectionUnitQueryFindAllServersEndpoint() {
    }

    public ProspectionUnitQueryFindAllServersEndpoint(RuleUnit<com.prospection.queries.ProspectionUnit> ruleUnit) {
        this.ruleUnit = ruleUnit;
    }

    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<com.prospection.model.Server> executeQuery(com.prospection.queries.ProspectionUnit unitDTO) {
        RuleUnitInstance<com.prospection.queries.ProspectionUnit> instance = ruleUnit.createInstance(unitDTO);
        // Do not return the result directly to allow post execution codegen (like monitoring)
        List<com.prospection.model.Server> response = instance.executeQuery(ProspectionUnitQueryFindAllServers.class);
        instance.dispose();
        return response;
    }

    @POST()
    @Path("/first")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public com.prospection.model.Server executeQueryFirst(com.prospection.queries.ProspectionUnit unitDTO) {
        List<com.prospection.model.Server> results = executeQuery(unitDTO);
        com.prospection.model.Server response = results.isEmpty() ? null : results.get(0);
        return response;
    }
}
