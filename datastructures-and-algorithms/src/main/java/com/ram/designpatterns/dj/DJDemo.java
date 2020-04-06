package com.ram.designpatterns.dj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DJDemo {

    //    private static final Logger logger = LogManager.getLogger("DJDemo");
    private static final Logger logger = LoggerFactory.getLogger(DJDemo.class);

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "/Volumes/workplace/programming-in-java/datastructures-and-algorithms/src/main/resources/log4j2.xml");
        logger.trace("Entering application.");

        int start = Integer.MAX_VALUE;
        int end = Integer.MAX_VALUE;
        //int x = 20;

        int middle = (start + end)/2;
        System.out.println("Integer Max Value = " + start);
        System.out.println("Result (x + y)/2 = " + middle);
        int mid =  start +  (end - start)/2;

        System.out.println("5           = " + Integer.toBinaryString(5));
        System.out.println("~5          = " + Integer.toBinaryString(~5));
        System.out.println("-5 (~5 + 1) = " + Integer.toBinaryString(~5 + 1));
        System.out.println("-5          = " + Integer.toBinaryString(-5));

        // a - b = a + (-b) =  -b nothing but a 2s comple b
        // 6- 7 = 6 + 2 compl 7
//        int z = 2 + (x - 2)/2;
//        System.out.println("Result (x + 2)/2 = " + y);
//        System.out.println("Result z = 2 + (x - 2)/2; = " + z);

        int n  = 15 ;

        System.out.println("0th th bit is set or not = " + (n & 1));

        System.out.println("1st bit is set or not = " + (n & (1 << 1)));
        System.out.println("2nd bit is set or not = " + (n & (1 << 2)));
        System.out.println("3nd bit is set or not = " + (n & (1 << 3)));
        System.out.println("3nd bit is set or not = " + ((n >> 3) & 1));
        System.out.println(Integer.toBinaryString((1 << 3)));
    }
}
