package com.commands.macrocommand;

public class CoffeeMachineOn implements Command {

    CoffeeMachine coffeeMachine;

    public CoffeeMachineOn(CoffeeMachine machine) {
        coffeeMachine = machine;
    }

    @Override
    public void execute() {
        coffeeMachine.on();
        coffeeMachine.makeCoffee();
    }
}
