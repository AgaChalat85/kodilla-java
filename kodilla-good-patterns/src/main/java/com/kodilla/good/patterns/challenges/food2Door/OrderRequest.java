package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Map;

public class OrderRequest {

    private long orderNumber;
    private Map<String, Integer>  orderList;
    private Shop shop;

    public OrderRequest(long orderNumber, Map<String, Integer> orderList, Shop shop) {
        this.orderNumber = orderNumber;
        this.orderList = orderList;
        this.shop = shop;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public Map<String, Integer> getOrderList() {
        return orderList;
    }

    public Shop getShop() {
        return shop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderRequest that = (OrderRequest) o;

        if (orderNumber != that.orderNumber) return false;
        return orderList != null ? orderList.equals(that.orderList) : that.orderList == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (orderNumber ^ (orderNumber >>> 32));
        result = 31 * result + (orderList != null ? orderList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "orderNumber=" + orderNumber +
                ", orderList=" + orderList +
                ", shop=" + shop +
                '}';
    }
}
