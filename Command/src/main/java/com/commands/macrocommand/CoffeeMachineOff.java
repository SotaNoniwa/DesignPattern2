package com.commands.macrocommand;

public class CoffeeMachineOff implements Command {

    CoffeeMachine coffeeMachine;

    public CoffeeMachineOff(CoffeeMachine machine) {
        coffeeMachine = machine;
    }

    @Override
    public void execute() {
        coffeeMachine.off();
    }
}
