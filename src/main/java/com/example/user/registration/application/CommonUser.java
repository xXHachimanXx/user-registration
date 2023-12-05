package com.example.user.registration.application;

class CommonUser implements User {

    private String name;
    private String password;

    public CommonUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean passwordIsValid() {
        return password != null && password.length() > 5;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
