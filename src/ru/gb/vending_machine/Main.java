package ru.gb.vending_machine;

import ru.gb.vending_machine.product.Beverages;
import ru.gb.vending_machine.product.Product;
import ru.gb.vending_machine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product = new Beverages("coca-cola", 350, 0.35);
        Product product2 = new Beverages("fanta", 350, 0.35);
        Product product3 = new Beverages("sprite", 350, 0.35);

        vendingMachine.addProduct(product);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product2);

        System.out.println(vendingMachine.getProductsInfo());
    }
}