package com.commands.macrocommand;

public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    // Executes holding commands one at a time
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
