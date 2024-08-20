package com.samsung.btcuoikhoa.repositories.models;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Long, Integer> cartItems = new HashMap<>();

    public void addProduct(Long productId, int qty) {
        cartItems.put(productId, cartItems.getOrDefault(productId, 0) + qty);
    }

    public Map<Long, Integer> getCartItems() {
        return cartItems;
    }
}

