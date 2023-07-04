package com.example.demo;

import com.example.demo.repositories.UserRepository;
import com.example.demo.models.User;

public class DemoApplication {

	public static void main(String[] args) {
		UserRepository userRepository = new UserRepository();
		System.out.println("userDao = " + userRepository.getAll());

		//create new user entity
		User user = new User();
		user.setId(1L);
		user.setUserName("usename1");
		user.setAddress("address1");

		User user2 = new User();
		user2.setId(2L);
		user2.setUserName("usename2");
		user2.setAddress("address2");

		userRepository.save(user);
		userRepository.save(user2);

		//fetch user from db
		System.out.println("fetch all = " + userRepository.getAll());

		//fetch single user
		final User user1 = userRepository.findById(1L);
		System.out.println("user1 = " + user1);

		System.out.println("user2 = " + userRepository.findById(2L));
	}
}
