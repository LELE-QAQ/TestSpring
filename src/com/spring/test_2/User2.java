package com.spring.test_2;

public class User2 {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User2{" +
                "username='" + username + '\'' +
                '}';
    }
}
