package com.example.databaseconnection.service;

import com.example.databaseconnection.model.User;

public interface UserService {
    Iterable<User> listUsers();
}
