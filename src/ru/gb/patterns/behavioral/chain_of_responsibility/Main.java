package ru.gb.patterns.behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Notifier notifier1 = new LogNotifier(1);
        Notifier notifier2 = new EmailNotifier(2);
        Notifier notifier3 = new SMSNotifier(3);

        notifier1.setNextNotifier(notifier2);
        notifier2.setNextNotifier(notifier3);

        notifier1.manageMessage(1, "All is fine");
        notifier1.manageMessage(2, "Something went wrong");
        notifier1.manageMessage(3, "All is baad");
    }
}
