package com.example.demo.service;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepo;

import java.util.Optional;


public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void createUser(User user) {
        userRepo.createUser(user);
    }

    public Optional<User> getUser(String userID) {
        return Optional.ofNullable(userRepo.findById(userID));
    }

}
