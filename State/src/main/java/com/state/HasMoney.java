package com.state;

public class HasMoney implements State {

    VendingMachine machine;

    public HasMoney(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("ERROR: no state transition occurs");
    }

    @Override
    public void pressBuyButton() {
        System.out.println("SUCCESS: HasMoney -> DrinkSold");
        machine.setState(machine.getDrinkSold());
    }

    @Override
    public void pressCancelButton() {
        System.out.println("SUCCESS: HasMoney -> Idle");
        machine.setState(machine.getIdle());
    }

    @Override
    public void dispenseDrink() {
        System.out.println("ERROR: no state transition occurs");
    }

    @Override
    public void refill(int stocks) {
        System.out.println("ERROR: no state transition occurs");
    }
}
