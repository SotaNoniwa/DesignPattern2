package com.proxy.dynamic;

public class BankAccount implements IBankAccount {

    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposit $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println(name + " withdraw $" + amount);
    }

    @Override
    public void viewBalance() {
        System.out.println(name + "'s balance: $" + balance);
    }
}
