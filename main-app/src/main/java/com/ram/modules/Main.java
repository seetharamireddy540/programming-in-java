package com.ram.modules;

import com.ram.modules.test.EngineImpl;

public class Main {
    
    public static void main(String arg[]) {
        System.out.printf("Application started ....");
        
        Object object = new EngineImpl();
        Engine ent = (Engine) object;
        System.out.print("\n Object found in ActivityProvider and type is :  " + object.getClass());
        System.out.println(ent.process(" \n sfdsfd"));
    
//        Injector injector = Guice.createInjector(new RamModule());
//        Engine herdEngine = injector.getInstance(HerdEngine.class);
//        Engine torchEngine = injector.getInstance(TorchEngine.class);
//
//        System.out.println(herdEngine.process("H"));
//        System.out.println(herdEngine.hashCode());
//        System.out.println(torchEngine.process("Torch"));
    }
}
