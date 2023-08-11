package ru.gb.family_tree;

import ru.gb.family_tree.node.NodeCouple;
import ru.gb.family_tree.operations.FamilyTree;
import ru.gb.family_tree.person.Gender;
import ru.gb.family_tree.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        List<NodeCouple> coupleList = new ArrayList<>();

        Person frederick = new Person("Frederick", "Trump", "Christ",
                LocalDate.of(1905, 10, 11), LocalDate.of(1999, 6, 25), Gender.Male);
        peopleList.add(frederick);
        Person mary = new Person("Mary", "Trump", "Anne",
                LocalDate.of(1912, 5, 10), LocalDate.of(2000, 8, 7), Gender.Female);
        peopleList.add(mary);
        NodeCouple couple1 = new NodeCouple(mary, frederick, 1936);
        coupleList.add(couple1);

        Person donald = new Person("Donald", "Trump", "John",
                LocalDate.of(1946, 6, 14), Gender.Male);
        peopleList.add(donald);
        couple1.addChild(donald);


        Person ivana = new Person("Ivana", "Trump", "Marie",
                LocalDate.of(1949, 2, 20), LocalDate.of(2022, 7, 14), Gender.Female);
        peopleList.add(ivana);
        NodeCouple donaldCouple1 = new NodeCouple(ivana, donald, 1977, 1989);
        coupleList.add(donaldCouple1);

        Person donaldJr = new Person("Donald", "Trump Jr.", "John",
                LocalDate.of(1977, 12, 31), Gender.Male);
        peopleList.add(donaldJr);
        Person ivanka = new Person("Ivanka", "Trump", "Marie",
                LocalDate.of(1981, 10, 30), Gender.Female);
        peopleList.add(ivanka);
        Person eric = new Person("Eric", "Trump", "Frederick",
                LocalDate.of(1984, 1, 6), Gender.Male);
        peopleList.add(eric);
        donaldCouple1.addChild(donaldJr);
        donaldCouple1.addChild(ivanka);
        donaldCouple1.addChild(eric);


        Person marla = new Person("Marla", "Maples", "Ann",
                LocalDate.of(1963, 10, 27), Gender.Female);
        peopleList.add(marla);
        NodeCouple donaldCouple2 = new NodeCouple(marla, donald, 1993, 1999);
        coupleList.add(donaldCouple2);

        Person tiffany = new Person("Tiffany", "Trump", "Ariana",
                LocalDate.of(1993, 10, 13), Gender.Female);
        peopleList.add(tiffany);
        donaldCouple2.addChild(tiffany);


        Person melania = new Person("Melania", "Trump", "",
                LocalDate.of(1970, 4, 26), Gender.Female);
        peopleList.add(melania);
        NodeCouple donaldCouple3 = new NodeCouple(melania, donald, 2004);
        coupleList.add(donaldCouple3);

        Person barron = new Person("Barron", "Trump", "William",
                LocalDate.of(2006, 3, 20), Gender.Male);
        peopleList.add(barron);
        donaldCouple3.addChild(barron);

        System.out.println(couple1);
        System.out.println(donaldCouple1);
        System.out.println(donaldCouple2);
        System.out.println(donaldCouple3);


        FamilyTree familyTree = new FamilyTree(peopleList, coupleList);
        System.out.println(familyTree.getParents(barron));
        System.out.println(familyTree.getChildren(donald));
    }
}
