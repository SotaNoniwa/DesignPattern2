package com.decorator;

// Component class
public abstract class IceCream {

    public String description = "Unknown ice cream";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
