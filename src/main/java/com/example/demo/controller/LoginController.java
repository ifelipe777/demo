package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user/find/{username}")
    public User findUser(@PathVariable final String username){
        User userdb = userService.findUserByUserName(username);
        if(!Objects.isNull(userdb)){
                return userdb;
        }

        return null;
    }
}
