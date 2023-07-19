package com.example.demo;

import com.example.demo.controller.*;
import com.example.demo.dtos.ProductRequestDTO;
import com.example.demo.dtos.UserRequestDTO;
import com.example.demo.models.Order;
import com.example.demo.repositories.*;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserCartService;
import com.example.demo.service.UserService;
import com.example.demo.validator.ProductValidator;

import java.util.List;

public class Solution {

	public static void main(String[] args) {

		UserRequestDTO user1 = new UserRequestDTO("user1", "Gaurav Hasiza", "gaurav@gmail.com", "password123");
		ProductRequestDTO product1 = new ProductRequestDTO("prod1", "coffee", "coffee is bad for health", 999.99, 10);

		ProductValidator productValidator = new ProductValidator();
		ProductRepo productRepo = new ProductRepo(productValidator);
		ProductService productService = new ProductService(productRepo);


		UserRepo userRepo = new UserRepo();
		UserCartRepo userCartRepo = new UserCartRepo();
		OrderRepo orderRepo = new OrderRepo();


		UserService userService = new UserService(userRepo);
		OrderService orderService = new OrderService(orderRepo, userCartRepo);
		UserCartService userCartService = new UserCartService(userCartRepo, productRepo);

		CreateProductHandler createProductHandler = new CreateProductHandler(productService);
		createProductHandler.createProduct(product1);
		GetProductHandler getProductHandler = new GetProductHandler(productService);
		OrderHandler orderHandler = new OrderHandler(orderService);
		UserHandler userHandler = new UserHandler(userService);
		UserCartHandler userCartHandler = new UserCartHandler(userCartService);
		userHandler.createUser(user1);

		System.out.println(userHandler.getUser("user1").getName());

		userCartHandler.addToCart("user1", "prod1", 1);

		orderHandler.checkout("user1");
		List<Order>  orderHistory = orderHandler.getOrderHistory("user1");
		for (Order order : orderHistory) {
			System.out.println("Order ID: " + order.getOrderId() + ", Total Amount: $" + order.getTotalAmount());
		}

	}
}
