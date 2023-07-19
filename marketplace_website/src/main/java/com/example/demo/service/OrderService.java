package com.example.demo.service;

import com.example.demo.models.CartItem;
import com.example.demo.models.Order;
import com.example.demo.repositories.OrderRepo;
import com.example.demo.repositories.UserCartRepo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderService {

    private final OrderRepo orderRepo;
    private final UserCartRepo userCartRepo;

    public OrderService(OrderRepo orderRepo, UserCartRepo userCartRepo) {
        this.orderRepo = orderRepo;
        this.userCartRepo = userCartRepo;
    }

    public void checkout(String userId) {
        List<CartItem> cartItems = userCartRepo.getUserCart(userId);

        if (!cartItems.isEmpty()) {
            double totalAmount = 0;
            for (CartItem item : cartItems) {
                totalAmount += item.getPrice() * item.getQuantity();
            }
            // Create a new order and update the inventory
            orderRepo.placeOrder(userId, totalAmount);

            // Clear the user's cart
            userCartRepo.deleteUserCart(userId);

        }
    }
    public List<Order> getOrderHistory(String userId) {
        return orderRepo.getOrderHistory(userId);
    }
}
