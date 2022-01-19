package com.kodilla.good.patterns.challenges.food2Door;

public class DummyDataProvider {

    public static OrderRequest createDummyOrderRequest() {
        return new OrderRequest(ExtraFoodShop.SUPPLIER_NAME, new Product(1L, "Fish Soup"), 2);
    }

    public static Shop createDummyExtraFoodShop() {
        Shop extraFoodShop = new ExtraFoodShop();

        extraFoodShop.addProduct(new Product(1L, "Fish Soup"), 3);
        extraFoodShop.addProduct(new Product(2L, "Extra Fish Soup"), 2);
        extraFoodShop.addProduct(new Product(3L, "Something Extra"), 4);

        return extraFoodShop;
    }

    public static Shop createDummyGlutenFreeShop() {
        Shop glutenFreeShop = new GlutenFreeShop();

        glutenFreeShop.addProduct(new Product(4L, "Something without gluten"), 10);
        glutenFreeShop.addProduct(new Product(5L, "Gluten free beer"), 5);

        return glutenFreeShop;
    }

    public static Shop createDummyHealthyShop() {
        Shop healthyShop = new HealthyShop();

        healthyShop.addProduct(new Product(6L, "Apple"), 20);
        healthyShop.addProduct(new Product(7L, "Carrot"), 50);

        return healthyShop;
    }
}
