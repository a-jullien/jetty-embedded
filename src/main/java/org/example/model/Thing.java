package org.example.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Thing {

    //==================================================================================================================
    // Attributes
    //==================================================================================================================
    private final String name;
    private final String description;

    //==================================================================================================================
    // Constructors
    //==================================================================================================================
    public Thing(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    //==================================================================================================================
    // Getters
    //==================================================================================================================
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
