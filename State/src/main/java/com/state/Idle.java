package com.state;

public class Idle implements State {

    VendingMachine machine;

    public Idle(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("SUCCESS: Idle -> HasMoney");
        machine.setState(machine.getHasMoney());
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
        System.out.println("ERROR: no state transition occurs");
    }

    @Override
    public void refill(int stocks) {
        System.out.println("ERROR: no state transition occurs");
    }
}
