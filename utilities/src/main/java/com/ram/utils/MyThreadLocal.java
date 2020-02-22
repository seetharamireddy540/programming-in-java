package com.ram.utils;

public class MyThreadLocal {
    
    private static ThreadLocal<Context> userThreadLocal = new ThreadLocal<>();
    
    public static void set(Context context) {
        userThreadLocal.set(context);
    
    }
    
    public static void unSet() {
        userThreadLocal.remove();
    }
    
    public static Context get(){
        return userThreadLocal.get();
    }
}
