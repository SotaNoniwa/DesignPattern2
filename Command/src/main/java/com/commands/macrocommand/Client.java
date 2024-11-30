package com.commands.macrocommand;

public class Client {

    public static void main(String[] args) {
        // Create receivers
        Light light = new Light();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // Create commands and set corresponding receivers on them
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command coffeeMachineOnCommand = new CoffeeMachineOn(coffeeMachine);
        Command coffeeMachineOffCommand = new CoffeeMachineOff(coffeeMachine);

        // Create arrays of commands
        Command[] morningOn = {lightOnCommand, coffeeMachineOnCommand};
        Command[] morningOff = {lightOffCommand, coffeeMachineOffCommand};

        // Create macros
        MacroCommand morningOnMacro = new MacroCommand(morningOn);
        MacroCommand morningOffMacro = new MacroCommand(morningOff);

        RemoteControl rc = new RemoteControl();
        rc.setCommands(0, morningOnMacro, morningOffMacro);

        System.out.println(rc);

        System.out.println("--- Pushing Macro On ---");
        rc.onButtonWasPushed(0);
        System.out.println("\n--- Pushing Macro Off ---");
        rc.offButtonWasPushed(0);
    }
}
