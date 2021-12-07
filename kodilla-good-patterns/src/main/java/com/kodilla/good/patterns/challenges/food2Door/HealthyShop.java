package com.kodilla.good.patterns.challenges.food2Door;

public class HealthyShop extends Shop {

    public HealthyShop() {
        super("HealthyShop");

    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Dostawca: " + getCompanyName() + "\nZamówienie jest w trakcie realizacji");
        return true;
    }
}
