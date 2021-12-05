package com.kodilla.good.patterns.challenges.food2Door;

import java.math.BigDecimal;
import java.util.*;

public class FoodManufacturerRepository {

    Set<Shop> shopsList = new HashSet<>();

    public Set<Shop> getShops() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        extraFoodShop.addProduct(new Product("Pizza", "1001", BigDecimal.valueOf(15.00)), 200);
        extraFoodShop.addProduct(new Product("Burger", "1002", BigDecimal.valueOf(13.00)), 600);
        HealthyShop healthyShop = new HealthyShop("HealthyShop");
        healthyShop.addProduct(new Product("Orange Juice", "2001", BigDecimal.valueOf(8.00)), 600);
        healthyShop.addProduct(new Product("Avocado Burger", "2002", BigDecimal.valueOf(18.00)), 100);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");
        glutenFreeShop.addProduct(new Product("Ice Creme", "3001", BigDecimal.valueOf(5.00)), 490);
        glutenFreeShop.addProduct(new Product("Bread", "3002", BigDecimal.valueOf(4.00)), 120);

        shopsList.add(extraFoodShop);
        shopsList.add(healthyShop);
        shopsList.add(glutenFreeShop);

        return shopsList;
    }

    public void addShops(Shop shop) {
        shopsList.add(shop);
    }
}
