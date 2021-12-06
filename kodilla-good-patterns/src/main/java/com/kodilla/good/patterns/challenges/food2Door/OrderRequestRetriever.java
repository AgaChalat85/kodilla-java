package com.kodilla.good.patterns.challenges.food2Door;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Map<String, Integer> ordersList = new HashMap<>();
        ordersList.put("Gluten free bread", 2);
        ordersList.put("Gluten free bier", 6);
        ordersList.put("corn crisps", 3);

        return new OrderRequest(436121717, ordersList, new GlutenFreeShop());
    }
}
