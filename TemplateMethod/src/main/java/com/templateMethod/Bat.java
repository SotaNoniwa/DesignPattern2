package com.templateMethod;

public class Bat extends Animal {

    public Bat(String name) {
        super(name);
    }

    @Override
    public void wakeUp() {
        System.out.println(name + " wakes up in the night.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats insects.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps in the morning.");
    }
}
