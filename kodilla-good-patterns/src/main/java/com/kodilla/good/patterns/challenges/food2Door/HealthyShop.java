package com.kodilla.good.patterns.challenges.food2Door;

public class HealthyShop extends Shop{

    public HealthyShop(String name) {
        super(name);
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Zamowienie w sklepie " + getName() + "zostalo przyjete do realizacji");

    }
}
