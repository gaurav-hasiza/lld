package com.example.demo.validator;

import com.example.demo.models.Product;

public class ProductValidator {

    public boolean validate(Product product){
        // Validate product details
        String productId = product.getProductId();
        String name = product.getName();
        double price = product.getPrice();
        int stock = product.getStock();

        if (productId == null || productId.isEmpty()) {
            System.out.println("Error: Product ID cannot be empty.");
            return false;
        }

        if (name == null || name.isEmpty()) {
            System.out.println("Error: Product name cannot be empty.");
            return false;
        }

        if (price <= 0) {
            System.out.println("Error: Product price must be greater than 0.");
            return false;
        }

        if (stock < 0) {
            System.out.println("Error: Product stock cannot be negative.");
            return false;
        }
        return true;
    }
}
