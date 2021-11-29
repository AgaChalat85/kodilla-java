package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private Customer customer;
    private LocalDate orderDate;

    public OrderRequest(Customer customer, LocalDate orderDate) {
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public Customer getUser() {
        return customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
