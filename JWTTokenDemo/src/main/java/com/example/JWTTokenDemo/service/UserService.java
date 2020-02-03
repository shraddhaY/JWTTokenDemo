package com.example.JWTTokenDemo.service;

import java.util.List;

import com.example.JWTTokenDemo.model.User;
import com.example.JWTTokenDemo.model.UserDto;

public interface UserService {
	User save(UserDto user);
	
    List<User> findAll();
    
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
