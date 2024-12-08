package com.state;

public class OutOfStock implements State {

    VendingMachine machine;

    public OutOfStock(VendingMachine machine) {
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
        System.out.println("ERROR: no state transition occurs");
    }

    @Override
    public void refill(int stocks) {
        System.out.println("SUCCESS: OutOfStock -> Idle");
        machine.setStocks(stocks);
        machine.setState(machine.getIdle());
    }
}
