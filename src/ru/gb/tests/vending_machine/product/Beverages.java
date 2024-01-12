package ru.gb.tests.vending_machine.product;

public class Beverages extends Product {
    private double volume;

    public Beverages(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume=" + volume + "л.";
    }
}
