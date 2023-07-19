package com.example.demo.repositories;

import com.example.demo.models.Product;
import com.example.demo.validator.ProductValidator;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private final ProductValidator productValidator;
    private final List<Product> products;
    public ProductRepo(ProductValidator productValidator){
        products = new ArrayList<>();
        this.productValidator = productValidator ;
    }

    public void addProduct(Product product) {
        if (product == null) {
            System.out.println("Error: Product object is null.");
            return;
        }
        // validate product
        if (!productValidator.validate(product)){
            return;
        }
        // Check if the product ID is unique (if required)
        for (Product existingProduct : products) {
            if (existingProduct.getProductId().equals(product.getProductId())) {
                System.out.println("Error: Product ID already exists.");
                return;
            }
        }
        // All data is valid, store the product
        products.add(product);
    }

    public Product getProduct(String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null; // Product not found
    }
}
