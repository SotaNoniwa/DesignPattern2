package com.observer;

public class Client {

    public static void main(String[] args) {
        Company apple = new Company("Apple"); // concrete subject

        IAccount john = new Account("John");
        IAccount david = new Account("David");

        // John starts following Apple Inc.
        apple.registerAccount(john);
        apple.setSaleItem("iPhone 14");
        System.out.println("**********************");

        // David becomes a new follower to Apple Inc.
        apple.registerAccount(david);
        apple.setSaleItem("iPad");
        System.out.println("**********************");

        // John doesn't receive message from Apple Inc. as he deregistered for Apple Inc.
        apple.removeAccount(john);
        apple.setSaleItem("AirPods");
    }
}
