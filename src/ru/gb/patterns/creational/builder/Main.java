package ru.gb.patterns.creational.builder;

import ru.gb.patterns.creational.builder.builder.BusinessCardBuilder;
import ru.gb.patterns.creational.builder.builder.SmallBusinessCardBuilder;

public class Main {
    public static void main(String[] args) {
        BusinessCardBuilder builder = new SmallBusinessCardBuilder();

        BusinessCard smallCard = builder
                .setColor1("Black")
                .setColor2("White")
                .build();

        System.out.println(smallCard);
    }
}
