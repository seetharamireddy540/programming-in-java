package com.ram.pojos;

public class Configuration {

    private static final Configuration INSTANCE = new Configuration("Ram", "/va/iot");

    private String name;
    private String filePath;

    private Configuration(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
    }

    public static Configuration getINSTANCE() {
        return INSTANCE;
    }
}
