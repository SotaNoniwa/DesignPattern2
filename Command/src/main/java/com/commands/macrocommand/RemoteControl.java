package com.commands.macrocommand;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        // Our RemoteControl has 3 slots
        onCommands = new Command[3];
        offCommands = new Command[3];

        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    // Print slots info in pretty style
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() +
                    "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuilder.toString();
    }
}
