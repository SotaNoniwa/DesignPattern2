package com.command.simpleCommand;

// Concrete command
public class TurnOffTVCommand implements Command {

    TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}
