package com.kodilla.good.patterns.challenges.food2Door;

public class HealthyShop implements FoodManufacturer{


    @Override
    public String getName() {
        return "HealthyShop";
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Zamowienie w sklepie " + getName() + "zostalo przyjete do realizacji\nTwoje produkty zostaną dostarczone w ciągu 48 godzin");
        return true;
    }
}
