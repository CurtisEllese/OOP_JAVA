package ru.gb.study_group;

import ru.gb.study_group.model.service.Service;
import ru.gb.study_group.view.ConsoleView;
import ru.gb.study_group.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleView();

        view.start();
    }
}
