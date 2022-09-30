package com.prospection.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import com.prospection.model.Server;

public abstract class RulesB971395CFAAA21B288F92F1ED46D3348 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "com.prospection.queries";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("servers"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.DataStore> var_servers = D.globalOf(org.kie.kogito.rules.DataStore.class,
                                                                                                         "com.prospection.queries",
                                                                                                         "servers");

    public static final org.drools.model.Global<Integer> var_requiredDiskSpace = D.globalOf(Integer.class,
                                                                                            "com.prospection.queries",
                                                                                            "requiredDiskSpace");

    public static final org.drools.model.Global<Integer> var_requiredNumberOfProcessors = D.globalOf(Integer.class,
                                                                                                     "com.prospection.queries",
                                                                                                     "requiredNumberOfProcessors");

    public static final org.drools.model.Global<Integer> var_requiredMemory = D.globalOf(Integer.class,
                                                                                         "com.prospection.queries",
                                                                                         "requiredMemory");

    public static final org.drools.model.Query0Def queryDef_FindFailedServers = D.query("com.prospection.queries",
                                                                                        "FindFailedServers");

    public static final org.drools.model.Query0Def queryDef_FindAllServers = D.query("com.prospection.queries",
                                                                                     "FindAllServers");

    public static final org.drools.model.Query0Def queryDef_FindPassedServers = D.query("com.prospection.queries",
                                                                                        "FindPassedServers");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    {
        globals.add(var_servers);
        globals.add(var_requiredDiskSpace);
        globals.add(var_requiredNumberOfProcessors);
        globals.add(var_requiredMemory);
    }
}
