package com.example.demo.service;

import com.example.demo.db.UserProvider;
import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private final UserProvider userProvider;

    @Override
    public User findUserByUserName(final String username) {
        Optional<User> optUser = userProvider.findUser(username);
        if(optUser.isPresent()){
            return optUser.get();
        }
        return null;
    }
}
