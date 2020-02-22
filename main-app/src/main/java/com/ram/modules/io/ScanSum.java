package com.ram.modules.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ScanSum {
    
    public static void main(String[] args) {
        
        Scanner s = null;
        double sum = 0;
        try {
            
            s = new Scanner(new BufferedReader(new FileReader("/Volumes/workplace/programming-in-java/main-app/src/main/java/com/ram/modules/io/numbers.txt")));
            
            while (s.hasNext()) {
                
                if (s.hasNextDouble()) {
                    sum = sum + s.nextDouble();
                } else {
                    s.next();
                }
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (s != null) {
                s.close();
            }
        }
        System.out.println(sum);
    }
    
}
