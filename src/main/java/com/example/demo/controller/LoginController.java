package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {

    @Autowired
    private final UserService userService;

    @RequestMapping("/user")
    public User login(@RequestBody final User user){
        User userdb = userService.findUserByUserName(user.getUsername());
        if(!Objects.isNull(userdb)){
            if(userdb.getPassword().equals(user.getPassword())){
                return userdb;
            }
        }

        return null;
    }
}
