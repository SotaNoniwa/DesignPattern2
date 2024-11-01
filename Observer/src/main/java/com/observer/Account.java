package com.observer;

public class Account implements IAccount {

    private String name;

    public Account(String name) {
        this.name = name;
    }

    @Override
    public void update(Company company) {
        System.out.println(this.name + " receives a new message from " + company.getName());
        System.out.println("New sale item: " + company.getSaleItem());
    }
}
