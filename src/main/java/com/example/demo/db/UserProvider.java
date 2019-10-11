package com.example.demo.db;

import com.example.demo.entity.User;

import java.util.Optional;

public interface UserProvider {

    Optional<User> findUser(final String username);
}
