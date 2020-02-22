package com.ram.modules.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    
    public static void main(String arg[]) throws IOException {
        
        System.out.println("CopyBytes ---- ");
        
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        
        try {
            fileInputStream = new FileInputStream("/Volumes/workplace/programming-in-java/main-app/src/main/java/com/ram/modules/io/xanadu.txt");
            fileOutputStream = new FileOutputStream("outagain.txt");
            
            int c;
            while ((c = fileInputStream.read()) != -1) {
                System.out.println(c);
                fileOutputStream.write(c);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            
        }
    }
}
