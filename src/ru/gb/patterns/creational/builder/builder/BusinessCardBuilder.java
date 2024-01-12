package ru.gb.patterns.creational.builder.builder;

import ru.gb.patterns.creational.builder.BusinessCard;

public abstract class BusinessCardBuilder {
    private BusinessCard card;

    public BusinessCardBuilder() {
        createCard();
    }

    abstract void createName();
    abstract void createPrice();
    abstract void createSize();

    public BusinessCardBuilder setColor1(String color1) {
        card.setColor1(color1);
        return this;
    }

    public BusinessCardBuilder setColor2(String color2) {
        card.setColor2(color2);
        return this;
    }

    private void createCard() {
        card = new BusinessCard();
    }

    BusinessCard getCard() {
        return card;
    }

    public BusinessCard build() {
        createName();
        createPrice();
        createSize();

        return  card;
    }
}
