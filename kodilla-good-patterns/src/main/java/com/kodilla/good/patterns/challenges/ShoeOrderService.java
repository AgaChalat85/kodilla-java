package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ShoeOrderService implements OrderService {

    @Override
    public boolean order(Customer customer, LocalDate orderDate) {
        System.out.println("Ordering Shoe for: " + customer.getFirstName() + " " +  customer.getLastName()
                + "on " + orderDate);

        return true;
    }
}
