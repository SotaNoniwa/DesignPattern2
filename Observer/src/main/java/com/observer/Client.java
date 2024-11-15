package com.observer;

public class Client {

    public static void main(String[] args) {
        Company nike = new Company("Nike"); // concrete subject

        IAccount john = new Account("John");
        IAccount david = new Account("David");

        // John starts following Nike Inc.
        nike.registerAccount(john);
        nike.setSaleItem("Nike Zoom"); // Releases a new item
        System.out.println("**********************");

        // David becomes a new follower to Nike Inc.
        nike.registerAccount(david);
        nike.setSaleItem("Nike Air"); // Releases a new item
        System.out.println("**********************");

        // John doesn't receive message from Nike Inc. as he removes follow
        nike.removeAccount(john);
        nike.setSaleItem("Air Jordan");
    }
}
