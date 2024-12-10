package com.proxy.dynamic;

public interface IBankAccount {

    // Anyone can access to account's name and number
    String getName();

    String getAccountNumber();

    // deposit, withdraw, viewBalance is only allowed by account holder
    void deposit(double amount);

    void withdraw(double amount);

    void viewBalance();
}
