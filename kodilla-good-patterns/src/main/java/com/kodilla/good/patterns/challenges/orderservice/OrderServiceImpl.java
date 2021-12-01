package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderServiceImpl implements OrderService{
    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println();
        orderRequest.getOrderList().forEach((k,v) -> System.out.println(k.getProductName() + ": " + v));
        return orderRequest.getOrderDate().isBefore(LocalDate.now());
    }
}
