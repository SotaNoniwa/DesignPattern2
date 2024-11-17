package com.factories.abstractFactory.product;

public class LightButton implements Button {

    @Override
    public void render() {
        System.out.println("Successfully render a light button");
    }
}
