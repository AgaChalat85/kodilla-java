package com.kodilla.good.patterns.challenges.food2Door;

public class GlutenFreeShop implements FoodManufacturer {

    @Override
    public String getName() {
        return "GlutenFreeShop";
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Zamowienie w sklepie " + getName() + "zostalo przyjete do realizacji\nTwoje produkty zostaną dostarczone w ciągu 48 godzin");
        return true;
    }
}
