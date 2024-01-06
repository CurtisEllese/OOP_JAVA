package ru.gb.study_group.view;

import ru.gb.study_group.presenter.Presenter;

import java.util.Scanner;

public class ConsoleView implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleView() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Добро пожаловать!");

        while (work) {
            printMenu();
            choice();
        }
    }

    private void choice() {
        String choiceStr = scanner.nextLine();
        //TODO: Метод проверки числа на валидность
        int choice = Integer.parseInt(choiceStr);
        menu.execute(choice);
    }

    public void error() {
        System.out.println("Введено не корректное число!");
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

    public void finish() {
        System.out.println("Завершение работы...");
        work = false;
    }

    public void addStudent() {
        System.out.println("Введите имя студента");
        String name = scanner.nextLine();
        System.out.println("Введите возраст студента");
        int age = Integer.parseInt(scanner.nextLine());
        presenter.addStudent(name, age);
    }

    public void getStudentListInfo() {
        presenter.getStudentListInfo();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
