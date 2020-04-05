package com.ram;

import java.util.function.Consumer;

public class Resource {

    private Resource() {
        System.out.println("Created...");
    }

    public Resource opt1() {
        System.out.println("Opt1...");
        return this;
    }

    public Resource opt2() {
        System.out.println("Opt2...");
        return this;
    }

    private void close() {
        System.out.println("Cleanup ...");
    }

    public static void use(Consumer<Resource> block) {
        Resource resource = new Resource();
        try {
            block.accept(resource);
        } finally {
            resource.close();
        }
    }
}
