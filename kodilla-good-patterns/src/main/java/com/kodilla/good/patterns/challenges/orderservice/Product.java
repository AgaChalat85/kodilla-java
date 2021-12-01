package com.kodilla.good.patterns.challenges.orderservice;

import java.math.BigDecimal;

public class Product {

    private String productName;
    private String productID;
    private BigDecimal price;

    public Product(String productName, String productID, BigDecimal price) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (productID != null ? !productID.equals(product.productID) : product.productID != null) return false;
        return price != null ? price.equals(product.price) : product.price == null;
    }

    @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 31 * result + (productID != null ? productID.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productID='" + productID + '\'' +
                ", price=" + price +
                '}';
    }
}