package ru.gb.tests.study_group.presenter;

import ru.gb.tests.study_group.model.service.Service;
import ru.gb.tests.study_group.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addStudent(String name, int age) {
        service.addStudent(name, age);
        getStudentListInfo();
    }

    public void getStudentListInfo() {
        view.printAnswer(service.getStudentsInfo());
    }

    public void sortByName() {
        service.sortByName();
        getStudentListInfo();
    }

    public void sortByAge() {
        service.sortByAge();
        getStudentListInfo();
    }
}
