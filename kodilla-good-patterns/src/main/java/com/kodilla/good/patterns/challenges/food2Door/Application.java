package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        OrderRequest orderRequest = DummyDataProvider.createDummyOrderRequest();

        new OrderProcessor().processOrder(orderRequest);
    }
}

