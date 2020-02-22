package com.ram.utils;

public class DBInvoker {
    
    
    public void getData() {
        
        System.out.println(" Invoking DB Invoker - Thread Name :" + Thread.currentThread().getName() + " User Id " + MyThreadLocal.get().getUserId());
    }
}
