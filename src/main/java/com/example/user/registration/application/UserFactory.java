package com.example.user.registration.application;

public interface UserFactory {
    User create(String name, String password);
}