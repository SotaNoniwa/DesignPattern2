package com.command.simpleCommand;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV(); // Create a receiver
        // Create commands on that receiver
        Command turnOnTV = new TurnOnTVCommand(tv);
        Command turnOffTV = new TurnOffTVCommand(tv);

        RemoteControl rc = new RemoteControl(); // Create an invoker
        rc.setCommand(turnOnTV, turnOffTV); // Set commands on that invoker

        rc.undoButtonWasPushed();
        rc.onButtonWasPushed();
        rc.offButtonWasPushed();
        rc.undoButtonWasPushed();
        rc.undoButtonWasPushed();
        rc.undoButtonWasPushed();
    }
}
