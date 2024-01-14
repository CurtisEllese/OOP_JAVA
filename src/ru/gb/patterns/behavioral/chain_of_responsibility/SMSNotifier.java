package ru.gb.patterns.behavioral.chain_of_responsibility;

public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Send SMS: " + message);
    }
}
