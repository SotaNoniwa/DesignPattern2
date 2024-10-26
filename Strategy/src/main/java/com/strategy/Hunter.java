package com.strategy;

/*
Concrete content in Strategy pattern
 */
public class Hunter extends Hero {

    @Override
    public void greet() {
        System.out.println("Let the hunt begin!");
    }
}
