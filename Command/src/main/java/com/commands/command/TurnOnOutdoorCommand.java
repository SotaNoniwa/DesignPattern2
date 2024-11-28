package com.command;

// Concrete command
public class TurnOnOutdoorCommand implements Command {

    private OutdoorLight outdoorLight;

    public TurnOnOutdoorCommand(OutdoorLight outdoorLight) {
        this.outdoorLight = outdoorLight;
    }

    @Override
    public void execute() {
        outdoorLight.turnOn();
    }

    @Override
    public void undo() {
        outdoorLight.turnOff();
    }
}
