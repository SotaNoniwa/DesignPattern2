package com.factories.abstractFactory.product;

public class DarkButton implements Button{

    @Override
    public void render() {
        System.out.println("Successfully render a dark button");
    }
}
