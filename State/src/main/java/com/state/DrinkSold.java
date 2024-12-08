package com.state;

public class DrinkSold implements State {

    VendingMachine machine;

    public DrinkSold(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("ERROR: no state transition occurs");
    }

    @Override
    public void pressBuyButton() {
        System.out.println("ERROR: no state transition occurs");
    }

    @Override
    public void pressCancelButton() {
        System.out.println("ERROR: no state transition occurs");
    }

    @Override
    public void dispenseDrink() {
        machine.customerTakesDrink();
        if (machine.getStocks() > 0) {
            System.out.println("SUCCESS: DrinkSold -> Idle");
            machine.setState(machine.getIdle());
        } else {
            System.out.println("SUCCESS: DrinkSold -> OutOfStock");
            machine.setState(machine.getOutOfStock());
        }
    }

    @Override
    public void refill(int stocks) {
        System.out.println("ERROR: no state transition occurs");
    }
}
