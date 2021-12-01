package com.kodilla.good.patterns.challenges.orderservice;

import com.kodilla.good.patterns.challenges.orderservice.Customer;
import com.kodilla.good.patterns.challenges.orderservice.InformationService;

public class MailService implements InformationService {

    @Override
    public void inform(Customer customer) {
        System.out.println("Send e-mail to: " + customer.getEMail());

    }
}
