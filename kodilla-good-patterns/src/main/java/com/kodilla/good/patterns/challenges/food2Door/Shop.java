package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public abstract class Shop {

    private String companyName;
    private Map<String, Integer> products = new HashMap<>();

    public Shop(String companyName) {
        this.companyName = companyName;
    }

    public void addProduct(String product, Integer quantity) {
        products.put(product, quantity);
    }

    public String getCompanyName() {
        return companyName;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public abstract boolean process(OrderRequest orderRequest);

    @Override
    public String toString() {
        return "Shop{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
