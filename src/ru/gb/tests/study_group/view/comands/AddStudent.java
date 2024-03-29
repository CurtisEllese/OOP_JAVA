package ru.gb.tests.study_group.view.comands;

import ru.gb.tests.study_group.view.ConsoleView;

public class AddStudent extends Command {
    public AddStudent(ConsoleView consoleView) {
        super("Добавить студента", consoleView);
    }

    @Override
    public void execute() {
        getConsoleView().addStudent();
    }
}
