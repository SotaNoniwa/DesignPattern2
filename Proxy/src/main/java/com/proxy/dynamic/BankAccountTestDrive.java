package com.proxy.dynamic;

import java.lang.reflect.Proxy;

public class BankAccountTestDrive {

    public static void main(String[] args) {
        BankAccountTestDrive test = new BankAccountTestDrive();
        test.drive();
    }

    public void drive() {
        // Instantiate real subject
        IBankAccount alex = new BankAccount("Alex", "123-abc-456", 500.0);

        System.out.println("-- Testing access via holder proxy --");
        IBankAccount holderProxy = getHolderProxy(alex); // Create proxy
        // Holder proxy allows everything
        System.out.println("Account name: " + holderProxy.getName());
        System.out.println("Account number: " + holderProxy.getAccountNumber());
        holderProxy.deposit(100.0);
        holderProxy.withdraw(50.0);
        holderProxy.viewBalance();

        System.out.println("-- Testing access via non-holder proxy --");
        IBankAccount nonHolderProxy = getNonHolderProxy(alex); // Create proxy
        // Non holder proxy allows getting name and account number
        System.out.println("Account name: " + holderProxy.getName());
        System.out.println("Account number: " + holderProxy.getAccountNumber());
        // Non holder proxy doesn't allow accessing credential info
        try {
            nonHolderProxy.deposit(200.0);
        } catch (Exception e) {
            System.out.println("Can't deposit from non-holder proxy");
        }
        try {
            nonHolderProxy.withdraw(50.0);
        } catch (Exception e) {
            System.out.println("Can't withdraw from non-holder proxy");
        }
        try {
            nonHolderProxy.viewBalance();
        } catch (Exception e) {
            System.out.println("Can't view balance from non-holder proxy");
        }
    }

    // This method takes a IBankAccount object (real subject) and returns a proxy for it.
    // Because proxy has the same interface as the subject, this method returns IBankAccount.
    IBankAccount getHolderProxy(IBankAccount account) {
        // Call static method newProxyInstance on Java API Proxy
        return (IBankAccount) Proxy.newProxyInstance(
                account.getClass().getClassLoader(), // Pass class loader
                account.getClass().getInterfaces(), // Proxy needs to implement the interfaces that real subject implements
                new HolderInvocationHandler(account)); // Pass real subject into the constructor of the invocation handler.
    }

    IBankAccount getNonHolderProxy(IBankAccount account) {
        return (IBankAccount) Proxy.newProxyInstance(
                account.getClass().getClassLoader(),
                account.getClass().getInterfaces(),
                new NonHolderInvocationHandler(account));
    }
}
