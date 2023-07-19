package com.example.demo.service;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepo;


public class ProductService {
    public final ProductRepo productRepo;
    public ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    public Product getProduct(String productId){
        return productRepo.getProduct(productId);
    }
}
