package com.factories.abstractFactory.product;

public class LightToolbar implements Toolbar {

    @Override
    public void render() {
        System.out.println("Successfully render a light toolbar");
    }
}
