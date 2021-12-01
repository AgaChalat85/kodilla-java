package com.kodilla.good.patterns.challenges.orderservice;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);
        if (isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest);
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }

    }
}