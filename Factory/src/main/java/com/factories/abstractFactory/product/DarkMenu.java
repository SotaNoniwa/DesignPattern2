package com.factories.abstractFactory.product;

public class DarkMenu implements Menu {

    @Override
    public void render() {
        System.out.println("Successfully render a dark menu");
    }
}
