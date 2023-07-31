package com.muhammet.service;

import com.muhammet.repository.entity.User;

import java.util.UUID;

public class UserService {

    public boolean save(User user){
        if(user== null){
            return false;
        }
        String id = UUID.randomUUID().toString();
        user.setId(id);
        System.out.println("User saved: " + user.toString());
        return true;
    }
}
