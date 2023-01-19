package com.example.mvc_netflix_1.controller;

import com.example.mvc_netflix_1.MainActivity;
import com.example.mvc_netflix_1.model.UserWS;
import com.example.mvc_netflix_1.model.pojo.User;

public class UserController {
    private UserWS model;
    private MainActivity view;

    public UserController(UserWS model, MainActivity view) {
        this.model = model;
        this.view = view;
    }

    public  void getUser(){
        User user = model.getData();
        view.printUserDetails(user);
    }
}
