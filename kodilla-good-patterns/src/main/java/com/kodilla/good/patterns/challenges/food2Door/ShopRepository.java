package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ShopRepository {

    private static Set<Shop> shops;

    static {
        shops = new HashSet<>();
        shops.add(DummyDataProvider.createDummyExtraFoodShop());
        shops.add(DummyDataProvider.createDummyGlutenFreeShop());
        shops.add(DummyDataProvider.createDummyHealthyShop());
    }

    public static Set<Shop> getShops() {
        return shops;
    }

    public static void addSupplier(Shop shop) {
        shops.add(shop);
    }

    public static Optional<Shop> findSupplier(String shopName) {
        return shops.stream().filter(x -> x.getName().equals(shopName)).findFirst();
    }
}
