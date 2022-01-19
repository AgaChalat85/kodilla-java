package com.kodilla.good.patterns.challenges.food2Door;

public class HealthyShop extends Shop {

    public static final String SUPPLIER_NAME = "Healthy Shop";

    public HealthyShop() {
        super(SUPPLIER_NAME);
    }

    @Override
    public boolean process(Product product, Integer quantity) {
        System.out.println("Nope. We don't have this stuff.");

        return false;
    }
}
