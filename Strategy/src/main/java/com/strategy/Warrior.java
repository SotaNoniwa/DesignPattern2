package com.strategy;

/*
Concrete content in Strategy pattern
 */
public class Warrior extends Hero {

    @Override
    public void greet() {
        System.out.println("Die with honor!");
    }
}
