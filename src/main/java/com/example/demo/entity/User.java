package com.example.demo.entity;

import com.example.demo.util.checker.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    @Email
    private String username;
    private String password;
}
