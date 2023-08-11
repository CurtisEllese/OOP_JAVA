package ru.gb.family_tree.node;

import ru.gb.family_tree.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NodeCouple {
    private Person wife;
    private Person husband;
    private int marriageYear;
    private int divorceYear;
    private List<Person> children;


    public NodeCouple(Person wife, Person husband, int marriageYear, int divorceYear) {
        this.wife = wife;
        this.husband = husband;
        this.marriageYear = marriageYear;
        this.divorceYear = divorceYear;
        this.children = new ArrayList<>();

    }

    public NodeCouple(Person wife, Person husband, int marriageYear) {
        this(wife, husband, marriageYear, 0);
    }

    public void setDivorceYear(int divorceYear) {
        this.divorceYear = divorceYear;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public Person getWife() {
        return wife;
    }

    public Person getHusband() {
        return husband;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Жена: ").append(wife)
                .append("\nМуж: ").append(husband)
                .append("\nГод женитьбы: ").append(marriageYear);

        if (divorceYear != 0) {
            builder.append("\nГод развода: ").append(divorceYear);
        }

        if (children != null) {
            builder.append("\nДети: ").append(children);
        }

        builder.append("\n");

        return builder.toString();
    }
}