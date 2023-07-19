package com.example.demo.models;

import lombok.Getter;

@Getter
public class CartItem {
    private String productId;
    private String name;
    private String description;
    private double price;
    private int quantity;
    // ... other relevant attributes and methods

    // Constructor
    public CartItem(String productId, String name, String description, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

}

