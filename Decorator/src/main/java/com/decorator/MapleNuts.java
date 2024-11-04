package com.decorator;

// Concrete decorator class
public class MapleNuts extends Topping {

    public MapleNuts(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", MapleNuts";
    }

    @Override
    public double cost() {
        return iceCream.cost() + .30;
    }
}
