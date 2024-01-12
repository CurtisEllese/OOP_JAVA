package ru.gb.tests.study_group.view.comands;

import ru.gb.tests.study_group.view.ConsoleView;

public class SortByName extends Command {
    public SortByName(ConsoleView consoleView) {
        super("Отсортировать по имени", consoleView);
    }

    @Override
    public void execute() {
        getConsoleView().sortByName();
    }
}
