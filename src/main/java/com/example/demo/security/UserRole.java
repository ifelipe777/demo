package com.example.demo.security;

public enum UserRole {

    USER("user"),
    ADMIN("admin"),
    AUDIT("audit");

    private String role;

    UserRole(final String role){
        this.role = role;
    }
}
