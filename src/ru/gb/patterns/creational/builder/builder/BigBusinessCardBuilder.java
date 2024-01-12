package ru.gb.patterns.creational.builder.builder;

public class BigBusinessCardBuilder extends BusinessCardBuilder {
    @Override
    void createName() {
        getCard().setName("Big Business Card");
    }

    @Override
    void createPrice() {
        getCard().setPrice(160);
    }

    @Override
    void createSize() {
        getCard().setSize(new int[] {40, 20});
    }
}
