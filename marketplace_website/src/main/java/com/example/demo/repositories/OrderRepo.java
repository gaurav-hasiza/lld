package com.example.demo.repositories;

import com.example.demo.models.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

//TODO: Add validator layer
public class OrderRepo {
    private final List<Order> orders;

    public OrderRepo() {
        this.orders = new ArrayList<>();
    }

    public void placeOrder(String userId, double totalAmount) {
        String orderId = generateOrderId();
        Date orderDate = new Date();
        String orderStatus = "Placed";
        Order order = new Order(orderId, userId, orderDate, totalAmount, orderStatus);
        orders.add(order);
    }
    private String generateOrderId() {
        return UUID.randomUUID().toString();
    }

    public List<Order> getOrderHistory(String userId) {
        List<Order> userOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getUserId().equals(userId)) {
                userOrders.add(order);
            }
        }
        return userOrders;
    }
}
