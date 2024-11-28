package com.command;

import java.util.Stack;

// Invoker
public class RemoteControl {

    private Command onCommand;
    private Command offCommand;
    public Stack<Command> undoCommands;

    public RemoteControl() {
        onCommand = new NoCommand();
        offCommand = new NoCommand();
        undoCommands = new Stack<>();
        undoCommands.push(new NoCommand());
    }

    public void setCommand(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onButtonWasPushed() {
        onCommand.execute();
        undoCommands.push(onCommand);
    }

    public void offButtonWasPushed() {
        offCommand.execute();
        undoCommands.push(offCommand);
    }

    public void undoButtonWasPushed() {
        if (!(undoCommands.peek() instanceof NoCommand)) {
            Command lastCommand = undoCommands.pop();
            lastCommand.undo();
        } else {
            System.out.println("undoCommands stack is empty!");
        }
    }
}
