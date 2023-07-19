package com.example.demo.models;

import java.util.Date;

public class Order {
    private String orderId;
    private String userId;
    private Date orderDate;
    private double totalAmount;
    private String orderStatus;
    // ... other relevant attributes and methods

    // Constructor
    public Order(String orderId, String userId, Date orderDate, double totalAmount, String orderStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getUserId() {
        return this.userId;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }
}