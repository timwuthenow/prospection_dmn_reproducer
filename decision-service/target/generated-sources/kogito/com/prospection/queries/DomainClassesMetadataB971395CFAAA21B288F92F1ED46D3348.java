package com.prospection.queries;
public class DomainClassesMetadataB971395CFAAA21B288F92F1ED46D3348 {

    public static final org.drools.model.DomainClassMetadata com_prospection_model_Server_Metadata_INSTANCE = new com_prospection_model_Server_Metadata();
    private static class com_prospection_model_Server_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.prospection.model.Server.class;
        }

        @Override
        public int getPropertiesSize() {
            return 6;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "ID": return 0;
                case "diskSpace": return 1;
                case "memory": return 2;
                case "numberOfProcessors": return 3;
                case "validated": return 4;
                case "validationMessages": return 5;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.prospection.model.Server");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_rules_DataStore_Metadata_INSTANCE = new org_kie_kogito_rules_DataStore_Metadata();
    private static class org_kie_kogito_rules_DataStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.rules.DataStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 2;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "spliterator": return 0;
                case "iterator": return 1;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.kie.kogito.rules.DataStore");
        }
    }

}