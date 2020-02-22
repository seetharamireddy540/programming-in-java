package com.ram.utils;

import lombok.SneakyThrows;

public class Task implements Runnable {
    
    private String userId;
    
    public Task(final String userId) {
        this.userId = userId;
    }
    
    @SneakyThrows
    @Override
    public void run() {
        MyThreadLocal.set(new Context(this.userId));
        
        Thread.currentThread().sleep(5000l);
        System.out.println("Thread Name : " + Thread.currentThread().getName() + " User Id " + MyThreadLocal.get().getUserId());
        System.out.println("Inside Task State - > " + Thread.currentThread().getState());
        new DBInvoker().getData();
        
    }
    
}
