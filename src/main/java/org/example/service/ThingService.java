package org.example.service;

import org.example.model.Thing;

import java.util.ArrayList;
import java.util.List;

public class ThingService {

    //==================================================================================================================
    // Attributes
    //==================================================================================================================
    private final List<Thing> things;

    //==================================================================================================================
    // Constructors
    //==================================================================================================================
    public ThingService() {
        this.things = new ArrayList<Thing>();
        this.things.add(new Thing("thing1", "thing1 description"));
        this.things.add(new Thing("thing2", "thing2 description"));
    }

    public List<Thing> getThings() {
        return things;
    }
}
