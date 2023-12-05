package com.example.user.registration.application;

interface User {
    boolean passwordIsValid();
    String getName();
    String getPassword();
}