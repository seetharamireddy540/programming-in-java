package com.ram.modules.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    
    public static void main(String[] args) throws IOException {
        System.out.println("CopyCharacters .....");
    
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        
        try {
            
            fileReader = new FileReader("/Volumes/workplace/programming-in-java/main-app/src/main/java/com/ram/modules/io/xanadu.txt");
            fileWriter = new FileWriter("output.text");
            
            int c;
            while((c= fileReader.read()) != -1) {
                System.out.println(c);
                fileWriter.write(c);
            }
            
        }catch (Exception ex) {
            ex.printStackTrace();
        
        }finally {
        
            if(fileReader != null) {
                fileReader.close();
            }
            if(fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
