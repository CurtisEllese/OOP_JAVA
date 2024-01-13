package ru.gb.patterns.structural.decorator;

public class MiddleDeveloper extends DeveloperDecorator{
    public MiddleDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + ' ' + codeReview();
    }

    private String codeReview() {
        return "review code";
    }
}
