package com.kodilla.good.patterns.challenges.food2Door;

public class OrderService {

    public boolean takeOrder(OrderRequest orderRequest) {
        System.out.println("Zamówienie: " + orderRequest + " zostało przyjęte");
        return true;
    }
}
