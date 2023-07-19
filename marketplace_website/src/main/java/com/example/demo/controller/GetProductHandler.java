package com.example.demo.controller;

import com.example.demo.models.Product;
import com.example.demo.service.ProductService;

public class GetProductHandler {
    private final ProductService productService;

    public GetProductHandler(ProductService productService) {
        this.productService = productService;
    }

    public Product getProduct(String productId) {
        return productService.getProduct(productId);
    }
}
