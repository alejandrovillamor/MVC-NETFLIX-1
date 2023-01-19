package com.example.mvc_netflix_1.model;

import com.example.mvc_netflix_1.model.pojo.User;

public class UserWS {
    private User user;

    public User getData(){
        User user = new User();
        user.setEmail("paco@gmail.com");
        user.setPassword("123");
        return user;
    }
    public User getUser(String email, String password ){
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

}
