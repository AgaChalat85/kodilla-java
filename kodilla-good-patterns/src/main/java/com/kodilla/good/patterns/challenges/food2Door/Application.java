package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Map<String, Integer> ordersList = new HashMap<>();
        ordersList.put("Piwo bezglutenowe", 6);
        ordersList.put("Chleb bezglutenowy", 1);
        ordersList.put("Chrupki kukurydziane", 5);

        OrderRequest orderRequest = new OrderRequest(743737, ordersList, new GlutenFreeShop());

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.realizeOrder(orderRequest);

    }
}

