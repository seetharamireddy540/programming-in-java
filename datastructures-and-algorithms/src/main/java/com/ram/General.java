package com.ram;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class General {

    public static void main(String[] args) {
//        printAllPermutations("ABC");
//        Integer tempInt[] = {1, 2, 3};
//        printAllSubSets(tempInt);
        // Generate random integers in range 0 to 999
        int rand_int1 = ThreadLocalRandom.current().nextInt();
        int rand_int2 = ThreadLocalRandom.current().nextInt();

        // Print random integers
        System.out.println("Random Integers: " + rand_int1);
        System.out.println("Random Integers: " + rand_int2);

//        IntStream.range(1, 10).forEach(i -> {
//            System.out.println("Math Random = " + Math.random());
//            System.out.println("Random = " +  new Random(100).nextInt());
//
//        });
        //System.out.println(factorial(10));

    }

    private static void printAllSubSets(Integer[] inputArray) {
        Integer subSet[] = new Integer[inputArray.length];
        helper(inputArray, subSet, 0);

    }

    private static void helper(Integer[] givenArray, Integer[] subSet, Integer i) {
        if (i == givenArray.length) {
            System.out.println(Arrays.toString(subSet));
        } else {
            subSet[i] = null;
            helper(givenArray, subSet, i + 1);
            subSet[i] = givenArray[i];
            helper(givenArray, subSet, i + 1);
        }
    }

    public static void printAllPermutations(String inputString) {
        if (inputString == null || inputString.length() == 0) {
            return;
        }
        char[] input = inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

        }
    }

    private static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
