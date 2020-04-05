package com.ram.multithreading;

import java.util.stream.IntStream;

public class Task {

    public static void main(String[] args) throws Exception {

        IntStream.range(0, 10).forEach((i) -> {
            System.out.println(Thread.currentThread().getName());
        });
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Thread - " + Thread.currentThread().getName());
            }
        });
        thread.start();
        Thread.currentThread().join();
    }
}
