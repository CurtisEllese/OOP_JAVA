package ru.gb.tests.study_group.view.comands;

import ru.gb.tests.study_group.view.ConsoleView;

public class SortByAge extends Command {
    public SortByAge(ConsoleView consoleView) {
        super("Отсортировать по возрасту", consoleView);
    }

    @Override
    public void execute() {
        getConsoleView().sortByAge();
    }
}
