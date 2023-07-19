package com.example.demo.controller;

import com.example.demo.models.Order;
import com.example.demo.service.OrderService;

import java.util.List;

public class OrderHandler {

    private final OrderService orderService;

    public OrderHandler(OrderService orderService) {
        this.orderService = orderService;
    }

    public List<Order> getOrderHistory(String userId) {
        return orderService.getOrderHistory(userId);
    }

    public void checkout(String userId) {
        orderService.checkout(userId);
    }
}
