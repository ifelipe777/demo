package com.example.demo.db.repository;

import com.example.demo.db.UserProvider;
import com.example.demo.entity.User;
import com.example.demo.entity.db.UsersDB;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRepository implements UserProvider {

    public Optional<User> findUser(final String username) {
        List<User> userdb = UsersDB.getInstance().getUsers();
        return userdb.stream().filter(u -> u.getUsername().equals(username)).findFirst();
    }

}
