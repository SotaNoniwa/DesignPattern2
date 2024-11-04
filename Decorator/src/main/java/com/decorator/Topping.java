package com.decorator;

// Base decorator class
public abstract class Topping extends IceCream {

    public IceCream iceCream;

    // All subclasses (concrete decorator classes) need to implement getDescription method,
    // by declaring this method as abstract, we enforce all subclasses to implement this method
    public abstract String getDescription();
}
