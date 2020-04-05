package com.ram.modules;

public class StringUtils {

    public static void main(String[] args) {
        String inputString1 = "ccaaadaaad";
        String inputString2 = "abc";
        String inputString3 = "xxxuxxx";
        System.out.println(solution(inputString3));
    }

    public static String solution(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int inputSize = inputString.length();
        while (i < inputSize) {
            char currentChar = inputString.charAt(i);
            stringBuilder.append(currentChar);
            int maxCount = 1;
            while (i < (inputSize - 1) && inputString.charAt(i) == inputString.charAt(i + 1)) {
                maxCount = maxCount + 1;
                if (maxCount < 3) {
                    stringBuilder.append(currentChar);
                }
                i++; // Increment i
            }
            i++; // Increment i
        }
        return stringBuilder.toString();
    }
}
