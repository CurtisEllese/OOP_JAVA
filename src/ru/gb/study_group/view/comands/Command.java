package ru.gb.study_group.view.comands;

import ru.gb.study_group.view.ConsoleView;

public abstract class Command {
    private String description;
    private ConsoleView consoleView;

    public Command(String description, ConsoleView consoleView) {
        this.description = description;
        this.consoleView = consoleView;
    }

    public String getDescription() {
        return description;
    }

    ConsoleView getConsoleView() {
        return consoleView;
    }

    public abstract void execute();
}
