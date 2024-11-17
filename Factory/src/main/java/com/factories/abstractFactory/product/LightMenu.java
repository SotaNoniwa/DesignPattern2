package com.factories.abstractFactory.product;

public class LightMenu implements Menu {

    @Override
    public void render() {
        System.out.println("Successfully render a light menu");
    }
}
