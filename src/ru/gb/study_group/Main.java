package ru.gb.study_group;

import ru.gb.study_group.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Donald", 19);
        service.addStudent("John", 18);
        service.addStudent("Sarah", 17);
        service.addStudent("Maria", 19);

        System.out.println(service.getStudentsInfo());

        service.sortByName();
        System.out.println(service.getStudentsInfo());

        service.sortByAge();
        System.out.println(service.getStudentsInfo());
    }
}
