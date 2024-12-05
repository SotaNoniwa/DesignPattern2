package com.templateMethod;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats dog food.");
    }

    @Override
    public void additionalBehavior() {
        System.out.println(name + " gets cuddled.");
    }
}
