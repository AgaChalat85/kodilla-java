package com.kodilla.good.patterns.challenges.food2Door;

public class GlutenFreeShop extends Shop {

    public static final String SUPPLIER_NAME = "Gluten Free Shop";

    public GlutenFreeShop() {
        super(SUPPLIER_NAME);
    }

    @Override
    public boolean process(Product product, Integer quantity) {
        System.out.println("I don't bother to check your order. I always return true");
        return true;
    }
}
