package com.example.user.registration.application;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    void shouldReturnFalse_whenGivenInvalidPassword() {
        var user = new CommonUser("John", "123");

        assertFalse(user.passwordIsValid());
    }
}
