package com.ram.designpatterns.dj;

public class BitwiseUtil {

    public static void main(String[] args) {

//        int ch = 'A';
//        int chr = 'Z';
//        System.out.println("A = " + Integer.toBinaryString(ch));
//        System.out.println("The ASCII value of Z is :" + chr);
//        System.out.println("The ASCII value of Z is :" + ch);

        //1111 1111 1111 1111 1111 1111 1111 1011

        System.out.println("Binary       -5     = " + Integer.toBinaryString(-5));
        System.out.println("Binary       5      = " + Integer.toBinaryString(5));
        System.out.println("Binary      10      = " + Integer.toBinaryString(10));
        System.out.println("Binary  Integer.MAX = " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Binary  Long.MAX    = " + Long.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Binary  Long.MAX    = " + Long.toBinaryString(Long.MAX_VALUE));
        System.out.println("Long.MAX            = " + Long.MAX_VALUE);

        System.out.println("40 << 1             = " + (40 << 1));
        System.out.println("100 << 1             = " + (100 << 1));
        System.out.println("200 << 1             = " + (200 << 1));


        System.out.println("40 >> 1             = " + (40 >> 1));
        System.out.println("100 >> 1             = " + (100 >> 1));
        System.out.println("200 >> 1             = " + (200 >> 1));

        System.out.println("-1 >>> 1             = " + (-1 >>> 1));
        System.out.println("-1 >> 1             = " + (-1 >> 1));

        System.out.println("Ith bid -  x & ( 1 << 10) = " + (5 & (1 << 0)));


        System.out.println("num & 1 = 4 & 1 = " + (5 & 1));


        System.out.println("10 >>> 1             = " + (10 >>> 1));
        System.out.println("10 >> 1             = " + (10 >> 1));

        System.out.println("-10 >>> 1             = " + (-10 >>> 1)); // Unsigned
        System.out.println("-10 >> 1             = " + (-10 >> 1)); // Logical shift


    }
}
