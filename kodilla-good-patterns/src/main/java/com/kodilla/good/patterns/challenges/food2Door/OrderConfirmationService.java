package com.kodilla.good.patterns.challenges.food2Door;

public class OrderConfirmationService {

    public void confirmOrder(OrderRequest orderRequest) {
        System.out.println("Zamowienie u dostawcy " + orderRequest.getShop() + " zostalo zrealizowane");
    }
}
