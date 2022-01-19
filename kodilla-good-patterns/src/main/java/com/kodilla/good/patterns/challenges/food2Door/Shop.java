package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public abstract class Shop implements Supplier {

    private String name;
    private Map<Product, Integer> products = new HashMap<>();

    public Shop(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    };

    protected Map<Product, Integer> getProducts() {
        return this.products;
    }

    protected void addProduct(Product product, Integer quantity) {
        this.products.put(product, quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        if (name != null ? !name.equals(shop.name) : shop.name != null) return false;
        return products != null ? products.equals(shop.products) : shop.products == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
