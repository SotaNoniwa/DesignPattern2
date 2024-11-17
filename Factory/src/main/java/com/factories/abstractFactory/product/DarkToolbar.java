package com.factories.abstractFactory.product;

public class DarkToolbar implements Toolbar {

    @Override
    public void render() {
        System.out.println("Successfully render a dark toolbar");
    }
}
