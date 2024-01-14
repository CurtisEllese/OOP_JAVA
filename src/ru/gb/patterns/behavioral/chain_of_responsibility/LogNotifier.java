package ru.gb.patterns.behavioral.chain_of_responsibility;

public class LogNotifier extends Notifier{
    public LogNotifier(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Write in log file: " + message);
    }
}
