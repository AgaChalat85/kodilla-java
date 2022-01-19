package com.kodilla.good.patterns.challenges.food2Door;

public class OrderRequest {

    private String shopName;
    private Product product;
    private Integer productQuantity;

    public OrderRequest(String shopName, Product product, Integer productQuantity) {
        this.shopName = shopName;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderRequest that = (OrderRequest) o;

        if (shopName != null ? !shopName.equals(that.shopName) : that.shopName != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        return productQuantity != null ? productQuantity.equals(that.productQuantity) : that.productQuantity == null;
    }

    @Override
    public int hashCode() {
        int result = shopName != null ? shopName.hashCode() : 0;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (productQuantity != null ? productQuantity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "supplierName='" + shopName + '\'' +
                ", product=" + product +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
