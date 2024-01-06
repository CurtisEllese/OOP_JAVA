package ru.gb.study_group.view;

import ru.gb.study_group.view.comands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commands;

    public MainMenu(ConsoleView console) {
        commands = new ArrayList<>();

        commands.add(new AddStudent(console));
        commands.add(new GetStudentInfo(console));
        commands.add(new SortByName(console));
        commands.add(new SortByAge(console));
        commands.add(new Finish(console));
    }

    public String menu() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public void execute(int choice) {
        Command command = commands.get(choice - 1);
        command.execute();
    }

    public int size() {
        return commands.size();
    }
}
