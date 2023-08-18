package ru.gb.second_family_tree;

import ru.gb.second_family_tree.file.FileHandlerForTree;
import ru.gb.second_family_tree.node.FamilyTree;
import ru.gb.second_family_tree.person.Gender;
import ru.gb.second_family_tree.person.Human;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree tree = new FamilyTree();

        tree.add(new Human("Frederick", Gender.Male, LocalDate.of(1905, 10, 11),
                LocalDate.of(1999, 6, 25)));
        tree.add(new Human("Mary", Gender.Female, LocalDate.of(1912, 5, 10),
                LocalDate.of(2000, 8, 7)));
        tree.add(new Human("Donald", Gender.Male, LocalDate.of(1946, 6, 14),
                tree.getByName("Frederick"), tree.getByName("Mary")));
        tree.add(new Human("Ivana", Gender.Female, LocalDate.of(1949, 2, 20),
                LocalDate.of(2022, 7, 14)));
        tree.add(new Human("Donald Jr", Gender.Male, LocalDate.of(1977, 12, 31),
                tree.getByName("Donald"), tree.getByName("Ivana")));
        tree.add(new Human("Ivanka", Gender.Female, LocalDate.of(1981, 10, 30),
                tree.getByName("Donald"), tree.getByName("Ivana")));
        tree.add(new Human("Eric", Gender.Male, LocalDate.of(1984, 1, 6),
                tree.getByName("Donald"), tree.getByName("Ivana")));

        System.out.println(tree.getInfo());

        FileHandlerForTree fhTree = new FileHandlerForTree(tree);
        fhTree.save();

        tree = (FamilyTree) fhTree.load();

        System.out.println(tree.getInfo());
    }
}
