package com.ram.multithreading;

import java.util.function.Function;

public class ArrayUtils {

    public static void main(String[] args) {

        Function<Integer, Integer> doubleIt = (i) -> 2 * i;
        System.out.println(doubleIt.apply(5));
    }
}
