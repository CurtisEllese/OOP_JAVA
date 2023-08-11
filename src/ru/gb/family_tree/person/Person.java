package ru.gb.family_tree.person;

import java.time.LocalDate;

public class Person {
    private String name;
    private String lastName;
    private String surname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;
    private Gender gender;

    public Person(String name, String lastName, String surname,
                  LocalDate dateOfBirth, LocalDate dateOfDeath, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.gender = gender;
    }

    public Person(String name, String lastName, String surname,
                  LocalDate dateOfBirth, Gender gender) {
        this(name, lastName, surname, dateOfBirth, null, gender);
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurname() {
        return surname;
    }

    public String getInitials() {
        return String.format("%s %s %s",name, lastName, surname);
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateToCalculate = dateOfDeath != null ? dateOfDeath : currentDate;

        int age = dateToCalculate.getYear() - dateOfBirth.getYear();
        if (dateToCalculate.getMonthValue() < dateOfBirth.getMonthValue() ||
                (dateToCalculate.getMonthValue() == dateOfBirth.getMonthValue() &&
                        dateToCalculate.getDayOfMonth() < dateOfBirth.getDayOfMonth())) {
            age--;
        }
        return age;
    }

    @Override
    public String toString() {
        if (surname.isEmpty()) {
            return String.format("%s %s",name, lastName);
        } else {
            return String.format("%s %s %s",name, lastName, surname);
        }
    }
}