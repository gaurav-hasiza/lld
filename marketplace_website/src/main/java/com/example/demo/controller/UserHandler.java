package com.example.demo.controller;


import com.example.demo.dtos.UserRequestDTO;
import com.example.demo.models.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;

import java.util.Optional;



public class UserHandler {
    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    public void createUser(UserRequestDTO userRequestDTO){
        // TODO: perform validation
        User user = new User(userRequestDTO.getUserId(), userRequestDTO.getName(),
                userRequestDTO.getEmail(), userRequestDTO.getPassword());
        userService.createUser(user);
    }

    public User getUser(String userId) {
        Optional<User> user = userService.getUser(userId);
        if (user.isPresent()){
            return user.get();
        }
        throw new IllegalArgumentException("User not found with Id" +  userId);
    }
}
