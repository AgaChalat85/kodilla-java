package com.kodilla.good.patterns.challenges.orderservice;

public interface OrderRepository {

    boolean createOrder(OrderRequest orderRequest);
}
