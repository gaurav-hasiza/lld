package com.example.demo.repositories;

import com.example.demo.models.CartItem;
import com.example.demo.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//TODO: Add validator layer
public class UserCartRepo {
    private final Map<String, List<CartItem>> userCarts;

    public UserCartRepo() {
        this.userCarts = new HashMap<>();
    }

    public List<CartItem> getUserCart(String userId){
        List<CartItem> cartItems = userCarts.getOrDefault(userId, new ArrayList<>());
        return cartItems;
    }

    public void addItemToUserCart(String userId, Product product,int quantity) {
        List<CartItem> cartItems = getUserCart(userId);
        if (product != null && quantity > 0) { // move this to validation layer
            CartItem newItem = new CartItem(product.getProductId(), product.getName(), product.getDescription(),
                    product.getPrice(), quantity);
            cartItems.add(newItem);
            userCarts.put(userId, cartItems);
        }
    }

    public void deleteUserCart(String userId){
        userCarts.remove(userId);
    }
}
