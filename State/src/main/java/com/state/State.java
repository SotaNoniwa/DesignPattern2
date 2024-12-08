package com.state;

// Declare all possible state transition methods
public interface State {

    void insertMoney();

    void pressBuyButton();

    void pressCancelButton();

    void dispenseDrink();

    void refill(int stocks);
}
