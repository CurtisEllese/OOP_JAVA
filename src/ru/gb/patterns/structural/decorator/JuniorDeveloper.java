package ru.gb.patterns.structural.decorator;

public class JuniorDeveloper implements  Developer{
    @Override
    public String makeJob() {
        return writeCode();
    }

    private String writeCode() {
        return "I can code";
    }
}
