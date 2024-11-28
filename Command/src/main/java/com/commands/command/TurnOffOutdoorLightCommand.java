package com.command;

// Concrete command
public class TurnOffOutdoorLightCommand implements Command {

    OutdoorLight outdoorLight;

    public TurnOffOutdoorLightCommand(OutdoorLight outdoorLight) {
        this.outdoorLight = outdoorLight;
    }

    @Override
    public void execute() {
        outdoorLight.turnOff();
    }

    @Override
    public void undo() {
        outdoorLight.turnOn();
    }
}
