package com.example.demo.controller;

import com.example.demo.dtos.ProductRequestDTO;
import com.example.demo.models.Product;
import com.example.demo.service.ProductService;

public class CreateProductHandler {

    private final ProductService productService;
    public CreateProductHandler(ProductService productService) {
        this.productService = productService;
    }

    public void createProduct(ProductRequestDTO productRequestDTO) {
        Product product = new Product(productRequestDTO.getProductId(), productRequestDTO.getName(),
                productRequestDTO.getDescription(), productRequestDTO.getPrice(), productRequestDTO.getStock());
        productService.addProduct(product);
    }

    public Product getProduct(String productId) {
        return productService.getProduct(productId);
    }
}
