package com.templateMethod;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    // TemplateMethod is final to prevent subclasses changes its structure
    public final void doDailyRoutine() {
        wakeUp();
        additionalBehavior();
        eat();
        sleep();
    }

    public void wakeUp() {
        System.out.println(name + " wakes up in the morning.");
    }

    public abstract void eat();

    public void sleep() {
        System.out.println(name + " sleeps in the night.");
    }

    public void additionalBehavior() {
    }
}
