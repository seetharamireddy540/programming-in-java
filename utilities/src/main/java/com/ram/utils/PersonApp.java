package com.ram.utils;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class PersonApp {
    public static void main(String[] args) {
        
        Person.builder().build();
        try {
            ThreadMXBean threadMXBean =  ManagementFactory.getThreadMXBean();
            System.out.println(threadMXBean.getClass().getName());
        } catch(Exception ex ){
        
        }
    }
}
