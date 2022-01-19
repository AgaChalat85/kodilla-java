package com.kodilla.good.patterns.challenges.food2Door;

public class ExtraFoodShop extends Shop {

    public static final String SUPPLIER_NAME = "Extra Food Shop";

    public ExtraFoodShop() {
        super(SUPPLIER_NAME);
    }

    public boolean process(Product product, Integer quantity) {

        Integer productQuantity = this.getProducts().get(product);
        boolean enough = productQuantity != null ? productQuantity >= quantity : false;

        if(enough) {
            System.out.println("Extra Food Shop will process your order");
        } else {
            System.out.println("We don't have this product or its quantity is not enough");
        }
        return enough;
    }
}
