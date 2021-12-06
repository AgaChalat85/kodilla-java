package com.kodilla.good.patterns.challenges.food2Door;

public class ExtraFoodShop implements FoodManufacturer {


    @Override
    public String getName() {
        return "ExtraFoodShop";
    }

    @Override
    public boolean process(OrderRequest order) {
        System.out.println("Zamowienie w sklepie " + getName() + "zostalo przyjete do realizacji\nTwoje produkty zostaną dostarczone w ciągu 48 godzin");
        return true;
    }
}
