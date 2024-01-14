package ru.gb.patterns.behavioral.chain_of_responsibility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Send an email: " + message);
    }
}
