package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderService {

    boolean order(Customer customer, LocalDate orderDate);


}
