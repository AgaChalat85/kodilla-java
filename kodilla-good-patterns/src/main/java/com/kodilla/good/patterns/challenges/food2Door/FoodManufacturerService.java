package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashSet;
import java.util.Set;

public class FoodManufacturerService {

    private Set<FoodManufacturer> foodManufacturers;


    public Set<FoodManufacturer> getFoodManufacturers() {
        this.foodManufacturers = new HashSet<>();
        foodManufacturers.add(new ExtraFoodShop());
        foodManufacturers.add(new GlutenFreeShop());
        foodManufacturers.add(new HealthyShop());
        return foodManufacturers;
    }

    public void addShops(FoodManufacturer manufacturer) {
        foodManufacturers.add(manufacturer);
    }

    public void removeShops(FoodManufacturer manufacturer) {
        foodManufacturers.remove(manufacturer);
    }
}

