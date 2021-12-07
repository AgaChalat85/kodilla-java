package com.kodilla.good.patterns.challenges.food2Door;

public class ExtraFoodShop extends Shop {


    public ExtraFoodShop() {
        super("ExtraFoodShop");

    }

    public boolean process(OrderRequest orderRequest) {
        System.out.println("Dostawca: " + getCompanyName() + ". Zamówienie jest w trakcie realizacji");
        return true;
    }
}
