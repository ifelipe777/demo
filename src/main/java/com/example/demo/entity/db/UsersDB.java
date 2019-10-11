package com.example.demo.entity.db;

import com.example.demo.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UsersDB {

    private static UsersDB instance;

    private List<User> users;

    private UsersDB(){
    }

    public static UsersDB getInstance(){
        if(Objects.isNull(instance)){
            instance = new UsersDB();
        }
        return instance;
    }

    public List<User> getUsers(){
        if(Objects.isNull(this.users)){
            users = new ArrayList<>();
        }
        populateDB();
        return users;
    }

    private void populateDB(){
        if(this.users.isEmpty()){
            users.add(User.builder().username("ivan.felipe777@gmail.com").password("123456").build());
            users.add(User.builder().username("jabjohanna@gmail.com").password("123456").build());
            users.add(User.builder().username("if.florez.be@gmail.com").password("123456").build());
        }
    }
}
