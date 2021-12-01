package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDate;

public class OrderServiceImpl implements OrderService {
    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("Zamówienie nr: " + orderRequest.getOrderNumber());
        System.out.println("Klient: " + orderRequest.getCustomer().getFirstName() + " " + orderRequest.getCustomer().getLastName());
        orderRequest.getOrderList().forEach((k,v) -> System.out.println("Produkt: " + k.getProductName() + " / Ilość: " + v));
        return orderRequest.getOrderDate().isBefore(LocalDate.now());
    }
}
