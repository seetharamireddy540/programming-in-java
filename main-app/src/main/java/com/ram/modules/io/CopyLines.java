package com.ram.modules.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        
        try {
            
            bufferedReader = new BufferedReader(new FileReader("/Volumes/workplace/programming-in-java/main-app/src/main/java/com/ram/modules/io/xanadu.txt"));
            printWriter = new PrintWriter(new FileWriter("output1.txt"));
            
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                printWriter.write(line);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
            
        } finally {
            
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            
            if (printWriter != null) {
                printWriter.close();
            }
            
        }
    }
}
