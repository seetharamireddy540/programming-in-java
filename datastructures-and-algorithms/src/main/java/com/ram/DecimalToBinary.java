package com.ram;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecimalToBinary {

    public static void main(String[] args) {

        int data = 16;

        Deque<Integer> stack = new ArrayDeque<>();

        while (data > 0) {

            int reminder = data % 2;
            data = data / 2;
            stack.push(reminder);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
