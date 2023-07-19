package com.example.demo.repositories;

import com.example.demo.models.User;

import java.util.*;

/**
 * @Author Gaurav Hasiza
 * @create 04/07/2023
 */

//TODO: Add validator layer
public class UserRepo {
    private final List<User> users;
    public UserRepo(){
        users = new ArrayList<>();
    }
    public User findById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null; // User not found
    }

    public List<User> fetchAllUsers(){
        return new ArrayList<>(users);
    }

    public void createUser(User user) {
        users.add(user);
    }

//    public Map<Long, User> getAll() {
//        return userMap;
//    }

//    private void validateUser(Long id) {
//        Optional.ofNullable(userMap.get(id))
//                .orElseThrow(() -> new RuntimeException("User not found"));
//    }
}
