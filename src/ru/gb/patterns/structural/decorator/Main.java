package ru.gb.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new JuniorDeveloper();
        developer = new MiddleDeveloper(developer);

        System.out.println(developer.makeJob());
    }
}
