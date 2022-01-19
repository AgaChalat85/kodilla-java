package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Optional;

public class OrderProcessor {

    public void processOrder(OrderRequest orderRequest) {
        Optional<Shop> shop = ShopRepository.findSupplier(orderRequest.getShopName());

        if(shop.isPresent()) {
            boolean ordered = shop.get().process(orderRequest.getProduct(), orderRequest.getProductQuantity());

            if(ordered) {
                System.out.println("Your product was ordered successfully!");
            } else {
                System.out.println("Something gone wrong. Please try again later.");
            }

        } else {
            System.out.println("Sorry we couldn't find the shop connected to the order.");
        }
    }
}
