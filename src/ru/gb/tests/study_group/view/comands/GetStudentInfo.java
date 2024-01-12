package ru.gb.tests.study_group.view.comands;

import ru.gb.tests.study_group.view.ConsoleView;

public class GetStudentInfo extends Command {
    public GetStudentInfo(ConsoleView consoleView) {
        super("Получить всех студентов", consoleView);
    }

    @Override
    public void execute() {
        getConsoleView().getStudentListInfo();
    }
}
