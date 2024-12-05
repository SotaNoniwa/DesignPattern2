package com.templateMethod;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats fruits.");
    }

    @Override
    public void additionalBehavior() {
        System.out.println(name + " sings.");
    }
}
