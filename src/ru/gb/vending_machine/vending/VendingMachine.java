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

    private String getProductsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список всех продуктов:\n");

        for (Product product : productList) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public Product getByName(String name) {
        for (Product product : productList) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return getProductsInfo();
    }
}
