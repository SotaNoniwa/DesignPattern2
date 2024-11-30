package com.commands.command;

public class Client {

    public static void main(String[] args) {
        OutdoorLight outdoorLight = new OutdoorLight(); // Create a receiver

        // Create commands on that receiver
        // These commands are encapsulated requests in other words
        Command turnOnOutdoorLight = new TurnOnOutdoorCommand(outdoorLight);
        Command turnOffOutdoorLight = new TurnOffOutdoorLightCommand(outdoorLight);

        RemoteControl rc = new RemoteControl(); // Create an invoker
        // We can pass encapsulated requests to other object
        rc.setCommand(turnOnOutdoorLight, turnOffOutdoorLight); // Set command on that invoker

        rc.undoButtonWasPushed();
        rc.onButtonWasPushed();
        rc.offButtonWasPushed();
        rc.undoButtonWasPushed();
        rc.undoButtonWasPushed();
        rc.undoButtonWasPushed();
    }
}
