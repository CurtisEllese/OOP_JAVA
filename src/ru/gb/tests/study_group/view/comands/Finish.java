package ru.gb.tests.study_group.view.comands;

import ru.gb.tests.study_group.view.ConsoleView;

public class Finish extends Command {
    public Finish(ConsoleView consoleView) {
        super("Завершить работу", consoleView);
    }

    @Override
    public void execute() {
        getConsoleView().finish();
    }
}