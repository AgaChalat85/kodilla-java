package com.kodilla.good.patterns.challenges.orderservice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Customer customer = new Customer("Marcin", "Wawrzykiewicz" ,"wawrzyk@onet.pl");
        LocalDate orderDate = LocalDate.of(2021,11,28);
        Map<Product,Integer> ordersList = new HashMap<>();
        ordersList.put(new Product("buty","b17882", BigDecimal.valueOf(63.99)), 1);
        ordersList.put(new Product("puzzle","p6782", BigDecimal.valueOf(14.50)), 2);
        ordersList.put(new Product("młotek","m680882", BigDecimal.valueOf(5.0)), 3);

        return new OrderRequest(2345663223L, customer, orderDate,ordersList);
    }
}

