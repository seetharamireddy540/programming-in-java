package com.ram.utils;

public class ThreadLocalDemoApp {
    
    public static void main(String[] args) throws InterruptedException {
        
        for (int i = 0; i < 3; i++) {
            
            Thread t1 = new Thread(new Task("Ram - " + i));
            System.out.println("State - > " + t1.getState());
            t1.start();
            System.out.println("State - > " + t1.getState());
            t1.join();
            System.out.println("About to create new Thread ...");
        }
        
        System.out.println("Main is thread is finished .....");
        
    }
}
