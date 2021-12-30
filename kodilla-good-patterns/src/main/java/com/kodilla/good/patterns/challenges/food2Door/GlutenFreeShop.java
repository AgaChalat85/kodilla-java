package com.kodilla.good.patterns.challenges.food2Door;

public class GlutenFreeShop extends Shop {

    public GlutenFreeShop() {
        super("GlutenFreeShop");

    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Dostawca: " + getCompanyName() + "\nZamówienie jest w trakcie realizacji");
        return true;
    }
}
