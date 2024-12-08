package com.state;

public class VendingMachineTestDrive {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(2);

        System.out.println(machine);

        System.out.println("-- Customer insert money and cancel the transaction --");
        machine.insertMoney();
        machine.pressCancelButton();

        System.out.println("-- Customer insert money and buy a drink --");
        machine.insertMoney();
        machine.pressBuyButton();

        System.out.println(machine);

        System.out.println("-- Customer insert money and buy a drink --");
        machine.insertMoney();
        machine.pressBuyButton();

        System.out.println(machine);

        System.out.println("-- Customer insert money --");
        machine.insertMoney();

        System.out.println("-- Owner is going to refill drinks --");
        machine.refill(2);
        System.out.println(machine);
    }
}
