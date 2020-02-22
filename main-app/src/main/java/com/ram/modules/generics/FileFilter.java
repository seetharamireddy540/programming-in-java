package com.ram.modules.generics;

import java.io.File;

@FunctionalInterface
public interface FileFilter {
    
    public boolean accept(File file);
}
