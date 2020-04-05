package com.ram.streams;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class StackUtil {

    public static void main(String[] args) {


        Stack<Integer> simpleStack = new Stack<>();

        simpleStack.push(1);
        simpleStack.push(2);
        simpleStack.push(4);
        simpleStack.push(5);
        simpleStack.push(53);
        System.out.println(simpleStack.isEmpty());
        System.out.println(simpleStack.size());
        System.out.println(simpleStack.peek());
        System.out.println(simpleStack.pop());
        System.out.println(simpleStack.pop());


        Queue<Integer> queue = new LinkedBlockingDeque<>(5);

        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(100);
        queue.offer(200);
        queue.offer(455);

        while (queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
