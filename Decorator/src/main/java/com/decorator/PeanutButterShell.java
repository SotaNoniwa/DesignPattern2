package com.decorator;

// Concrete decorator class
public class PeanutButterShell extends Topping {

    public PeanutButterShell(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", PeanutButterShell";
    }

    @Override
    public double cost() {
        return iceCream.cost() + .30;
    }
}
