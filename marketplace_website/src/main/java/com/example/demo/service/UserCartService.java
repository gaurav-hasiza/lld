package com.example.demo.service;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepo;
import com.example.demo.repositories.UserCartRepo;

public class UserCartService {

    private final UserCartRepo userCartRepo;
    private final ProductRepo productRepo;

    public UserCartService(UserCartRepo userCartRepo, ProductRepo productRepo) {
        this.userCartRepo = userCartRepo;
        this.productRepo = productRepo;
    }

    public void addToCart(String userId, String productId, int quantity) {
        Product product = productRepo.getProduct(productId);
        userCartRepo.addItemToUserCart(userId, product, quantity);
    }
}
