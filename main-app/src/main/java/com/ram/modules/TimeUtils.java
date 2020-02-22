package com.ram.modules;

import java.time.Instant;

public class TimeUtils {
    
    public static void main(String[] args) {
        System.out.println("Eligible Time : " +  Instant.now().toEpochMilli());
        System.out.println("Eligible Time (int) : " + (int) Instant.now().toEpochMilli());
        
    }
}
