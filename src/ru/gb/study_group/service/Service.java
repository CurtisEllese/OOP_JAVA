package ru.gb.study_group.service;

import ru.gb.study_group.group.GroupItem;
import ru.gb.study_group.group.StudyGroup;
import ru.gb.study_group.student.Student;

public class Service {
    private StudyGroup<Student> group;
    private int idStudent;

    public Service() {
        this.group = new StudyGroup<>();
    }

    public void addStudent(String name, int age) {
        Student student = new Student(idStudent++, name, age);
        group.addStudent(student);
    }

    public String getStudentsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов:\n");
        for (Student student : group) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        group.sortByName();
    }

    public void sortByAge() {
        group.sortByAge();
    }
}
