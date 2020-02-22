package com.ram.modules.generics;

import java.io.File;

public class FileApp {
    
    public static void main(String[] args) {
        
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return file.getName().endsWith(".java");
            }
        };
        
        FileFilter fileFilter1 = file -> file.getName().endsWith(".java");
    
        System.out.println("Result ->" + fileFilter1.accept(new File("/Volumes/workplace/programming-in-java/main-app/src/main/java/com/ram/modules/generics/FileApp.java")));
        
    }
}
