package com.kodilla.good.patterns.challenges.food2Door;

public class OrderProcessor {

    private ShopRepository shopRepository = new ShopRepository();
    private OrderService orderService = new OrderService();
    private OrderConfirmationService orderConfirmationService = new OrderConfirmationService();


    public void realizeOrder(OrderRequest orderRequest) {
        boolean isOrderPlaced = orderService.takeOrder(orderRequest);
        if (isOrderPlaced) {
            Shop shop = shopRepository.findShopForOrder(orderRequest);
            boolean isOrderExecuted = shop.process(orderRequest);
            if (isOrderExecuted) {
                orderConfirmationService.confirmOrder(orderRequest);
            }
        } else {
            System.out.println("Zamówienie nie zostało zrealizowane");
        }


        /*Shop shop = shopRepository.findShopForOrder(orderRequest);

        if (shop != null) {
            shop.process(orderRequest);
        } else {
            System.out.println("Nie znaleziono dostawcy, który może zrealizować to zamówienie");
        }*/
        }

}



