package com.example.demo.models;

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

    public String getProductId() {
        return this.productId;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
}

