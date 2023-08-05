package ru.gb.vending_machine.vending;

import ru.gb.vending_machine.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int id_product;
    private List<Product> productList;

    public VendingMachine() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        product.setId(id_product++);
        productList.add(product);
    }

    public String getProductsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список всех продуктов:\n");

        for (Product product : productList) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
