package com.example.databaseconnection.controller;

import com.example.databaseconnection.model.User;

import com.example.databaseconnection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Iterable<User> listUsers() {
        return userService.listUsers();
    }

}
