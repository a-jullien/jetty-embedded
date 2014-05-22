package org.example.http.handler;

import org.example.service.ThingService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

public class MyBinder extends AbstractBinder {

    //==================================================================================================================
    // Public
    //==================================================================================================================

    @Override
    protected void configure() {
        bind(ThingService.class).to(ThingService.class).in(Singleton.class);
    }
}
