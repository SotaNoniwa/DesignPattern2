package com.decorator;

// Concrete component class
public class ChocolateIceCream extends IceCream {

    public ChocolateIceCream() {
        description = "ChocolateIceCream";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
