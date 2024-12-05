package com.templateMethod;

public class AnimalTestDrive {

    public static void main(String[] args) {
        Animal bird = new Bird("Pigeon");
        Animal dog = new Dog("Golden retriever");
        Animal bat = new Bat("Silver-haired bat");

        bird.doDailyRoutine();
        System.out.println();
        dog.doDailyRoutine();
        System.out.println();
        bat.doDailyRoutine();
    }
}
