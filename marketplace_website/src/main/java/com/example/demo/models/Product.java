package com.example.demo.models;

public class Product {
    private final String productId;
    private final String name;
    private final String description;
    private final double price;
    private final int stock;
    // ... other relevant attributes and methods

    // Constructor
    public Product(String productId, String name, String description, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
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

    public int getStock() {
        return this.stock;
    }
}
