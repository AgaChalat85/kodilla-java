package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(Customer customer) {
        System.out.println("Send e-mail to: " + customer.getEMail());

    }
}
