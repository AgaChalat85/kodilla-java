package com.kodilla.good.patterns.challenges.food2Door;

import com.kodilla.good.patterns.challenges.orderservice.Product;

import java.time.LocalDate;
import java.util.Map;

public class OrderRequest {

    private long orderNumber;
    private LocalDate orderDate;
    private Map<String, Integer>  orderList;


    public OrderRequest(long orderNumber, LocalDate orderDate, Map<String, Integer> orderList) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.orderList = orderList;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Map<String, Integer> getOrderList() {
        return orderList;
    }

    public void setOrderList(Map<String, Integer> orderList) {
        this.orderList = orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderRequest that = (OrderRequest) o;

        if (orderNumber != that.orderNumber) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        return orderList != null ? orderList.equals(that.orderList) : that.orderList == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (orderNumber ^ (orderNumber >>> 32));
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (orderList != null ? orderList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "orderNumber=" + orderNumber +
                ", orderDate=" + orderDate +
                ", orderList=" + orderList +
                '}';
    }
}
