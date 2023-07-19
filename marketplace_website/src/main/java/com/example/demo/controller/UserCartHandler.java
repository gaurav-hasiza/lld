package com.example.demo.controller;

import com.example.demo.service.UserCartService;

public class UserCartHandler {
    private final UserCartService userCartService;

    public UserCartHandler(UserCartService userCartService) {
        this.userCartService = userCartService;
    }

    public void addToCart(String userId, String productId, int quantity) {
        userCartService.addToCart(userId,productId,quantity);
    }
}
