package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ShoeOrderRepository implements OrderRepository{
    @Override
    public boolean createOrder(Customer customer, LocalDate orderDate) {
        System.out.println("Saving shoe order in Database\nOrder date: " + orderDate + "\nCustomer: " + customer);
        return true;
    }
}
