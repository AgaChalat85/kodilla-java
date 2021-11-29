package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Customer customer = new Customer("Marcin", "Wawrzykiewicz" ,"wawrzyk@onet.pl");

        LocalDate orderDate = LocalDate.of(2021,11,28);

        return new OrderRequest(customer, orderDate);
    }
}

