package com.ram.dynamicprogramming;

public class Factorial {

    public static void main(String[] args) {

        int n = 100;
        System.out.println("Count of trailing 0s in "
                + n + "! is " + findTrailingZeros(n));

    }

    private static long computeFactorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * computeFactorial(n - 1);
    }

    // Function to return trailing
    // 0s in factorial of n
    static int findTrailingZeros(int n) {
        // Initialize result
        int count = 0;

        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1; i *= 5) {
            System.out.println("n /i = " + (n / i));
            count += n / i;
            System.out.println("next i = " + (i * 5));
        }

        return count;
    }

}
