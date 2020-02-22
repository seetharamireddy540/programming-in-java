package com.ram.modules.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ScanXan {
    
    public static void main(String[] args) {
        
        Scanner scanner = null;
        
        try {
            
            scanner = new Scanner(new BufferedReader(new FileReader("/Volumes/workplace/programming-in-java/main-app/src/main/java/com/ram/modules/io/xanadu.txt")));
            scanner.useDelimiter(",\\s*");
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
         if (scanner != null) {
             scanner.close();
         }
        }
    }
}
