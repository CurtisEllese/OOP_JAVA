package ru.gb.patterns.creational.builder.builder;

public class SmallBusinessCardBuilder extends BusinessCardBuilder {
    @Override
    void createName() {
        getCard().setName("Small Business Card");
    }

    @Override
    void createPrice() {
        getCard().setPrice(80);
    }

    @Override
    void createSize() {
        getCard().setSize(new int[] {16, 9});
    }
}
