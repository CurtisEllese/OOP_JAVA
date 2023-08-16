package ru.gb.family_tree.operations;

import ru.gb.family_tree.node.NodeCouple;
import ru.gb.family_tree.person.Person;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Person> persons;
    private List<NodeCouple> couples;

    public FamilyTree(List<Person> persons, List<NodeCouple> couples) {
        this.persons = persons;
        this.couples = couples;
    }

    public List<Person> getParents(Person person) {
        List<Person> parents = new ArrayList<>();
        for (NodeCouple couple : couples) {
            if (couple.getChildren().contains(person)) {
                parents.add(couple.getWife());
                parents.add(couple.getHusband());
            }
        }
        return parents;
    }

    public List<Person> getChildren(Person person) {
        List<Person> children = new ArrayList<>();
        for (NodeCouple couple : couples) {
            if (couple.getHusband().equals(person) || couple.getWife().equals(person)) {
                children.addAll(couple.getChildren());
            }
        }
        return children;
    }
}
