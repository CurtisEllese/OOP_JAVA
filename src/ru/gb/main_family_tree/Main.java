package ru.gb.main_family_tree;

import ru.gb.main_family_tree.node.FamilyTree;
import ru.gb.main_family_tree.person.Gender;
import ru.gb.main_family_tree.person.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.createEmptyFamilyTree();
        service.addPerson(new Human("Frederick", Gender.Male, LocalDate.of(1905, 10, 11),
                LocalDate.of(1999, 6, 25)), 0);
        service.addPerson(new Human("Mary", Gender.Female, LocalDate.of(1912, 5, 10),
                LocalDate.of(2000, 8, 7)), 0);
        service.addPerson(new Human("Donald", Gender.Male, LocalDate.of(1946, 6, 14),
                service.getByName("Frederick", 0), service.getByName("Mary", 0)), 0);
        service.addPerson(new Human("Ivana", Gender.Female, LocalDate.of(1949, 2, 20),
                LocalDate.of(2022, 7, 14)), 0);
        service.addPerson(new Human("Donald Jr", Gender.Male, LocalDate.of(1977, 12, 31),
                service.getByName("Donald", 0), service.getByName("Ivana", 0)), 0);
        service.addPerson(new Human("Ivanka", Gender.Female, LocalDate.of(1981, 10, 30),
                service.getByName("Donald", 0), service.getByName("Ivana", 0)), 0);
        service.addPerson(new Human("Eric", Gender.Male, LocalDate.of(1984, 1, 6),
                service.getByName("Donald", 0), service.getByName("Ivana", 0)), 0);


        service.createEmptyFamilyTree();
        service.addPerson(new Human("Ivan", Gender.Male, LocalDate.of(1990, 10, 11)), 1);
        service.addPerson(new Human("Anastasia", Gender.Female, LocalDate.of(1985, 5, 10)), 1);
        service.addPerson(new Human("Maria", Gender.Female, LocalDate.of(2010, 6, 14),
                service.getByName("Ivan", 1), service.getByName("Anastasia", 1)), 1);



        System.out.println(service.getInfo());
    }
}
