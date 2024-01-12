package ru.gb.tests.study_group;

import ru.gb.tests.study_group.view.ConsoleView;
import ru.gb.tests.study_group.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleView();

        view.start();
    }
}
