package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashSet;
import java.util.Set;

public class ShopRepository {

    private static Set<Shop> shops;

    static {
        shops = new HashSet<>();
        shops.add(new ExtraFoodShop());
        shops.add(new GlutenFreeShop());
        shops.add(new HealthyShop());
    }

    public Set<Shop> getShops() {
        return shops;
    }

    public void addShops(Shop shop) {
        shops.add(shop);
    }

    public void removeShops(Shop shop) {

        shops.remove(shop);
    }

    public Shop findShopForOrder(OrderRequest orderRequest) {
        Shop shop = orderRequest.getShop();
        return shop;
    }
    /*public Shop findShopForOrder(OrderRequest orderRequest) {
        Map.Entry<String,Integer> entry = orderRequest.getOrderList().entrySet().iterator().next();

        String productName = entry.getKey();
        Integer quantity = entry.getValue();
        Shop shop = shops.stream().filter(x-> x.getProducts().containsKey(productName)).findFirst().orElse(null);

        return (shop != null && shop.getProducts().get(productName) >= quantity) ? shop : null;
    }*/
}

