package com.ram.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.ram.modules.test.EngineImpl;

public class RamModule extends AbstractModule {
    
    @Override
    protected void configure() {
        bind(Engine.class).to(EngineImpl.class);
    }
    
    
    @Provides
    @Named("HerdEngine")
    public Engine getHerdEngine() {
        return new HerdEngine();
    }
    
    @Provides
    @Named("TorchEngine")
    public Engine getTorchEngine() {
        return new TorchEngine();
    }
}
