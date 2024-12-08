package com.state;

public class VendingMachine {

    private State idle;
    private State hasMoney;
    private State drinkSold;
    private State outOfStock;

    private State currentState;
    int stocks = 0;

    public VendingMachine(int stocks) {
        idle = new Idle(this);
        hasMoney = new HasMoney(this);
        drinkSold = new DrinkSold(this);
        outOfStock = new OutOfStock(this);

        this.stocks = stocks;
        if (stocks > 0) {
            currentState = idle;
        } else {
            currentState = outOfStock;
        }
    }

    // State transition methods, actual implementation is delegated to concrete states
    public void insertMoney() {
        currentState.insertMoney();
    }

    public void pressBuyButton() {
        currentState.pressBuyButton();
        currentState.dispenseDrink();
    }

    public void pressCancelButton() {
        currentState.pressCancelButton();
    }

    public void refill(int stocks) {
        currentState.refill(stocks);
    }

    // Method to be used by concrete states to move one state to another
    public void setState(State state) {
        currentState = state;
    }

    // Helper method used when dispensing a drink on DrinkSold state
    public void customerTakesDrink() {
        if (stocks > 0) {
            System.out.println("Customer grab a drink");
            stocks--;
        }
    }

    // Getter for each state
    public State getIdle() {
        return idle;
    }

    public State getHasMoney() {
        return hasMoney;
    }

    public State getDrinkSold() {
        return drinkSold;
    }

    public State getOutOfStock() {
        return outOfStock;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    @Override
    public String toString() {
        return "VendingMachine {" +
                "currentState: " + currentState.getClass().getSimpleName() +
                ", stocks: " + stocks +
                '}';
    }
}
