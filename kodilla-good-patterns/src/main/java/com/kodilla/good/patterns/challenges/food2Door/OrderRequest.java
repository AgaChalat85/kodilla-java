package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Map;

public class OrderRequest {

    private long orderNumber;
    private Map<String, Integer>  orderList;
    private FoodManufacturer foodManufacturer;


    public OrderRequest(long orderNumber, Map<String, Integer> orderList, FoodManufacturer foodManufacturer) {
        this.orderNumber = orderNumber;
        this.orderList = orderList;
        this.foodManufacturer = foodManufacturer;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public Map<String, Integer> getOrderList() {
        return orderList;
    }

    public FoodManufacturer getFoodManufacturer() {
        return foodManufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderRequest that = (OrderRequest) o;

        if (orderNumber != that.orderNumber) return false;
        if (orderList != null ? !orderList.equals(that.orderList) : that.orderList != null) return false;
        return foodManufacturer != null ? foodManufacturer.equals(that.foodManufacturer) : that.foodManufacturer == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (orderNumber ^ (orderNumber >>> 32));
        result = 31 * result + (orderList != null ? orderList.hashCode() : 0);
        result = 31 * result + (foodManufacturer != null ? foodManufacturer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "orderNumber=" + orderNumber +
                ", orderList=" + orderList +
                ", foodManufacturer=" + foodManufacturer +
                '}';
    }
}
