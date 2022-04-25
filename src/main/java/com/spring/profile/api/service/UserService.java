package com.spring.profile.api.service;

import com.spring.profile.api.entity.User;
import com.spring.profile.api.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = {"local", "dev", "prod"})
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> findAllUser(){
        return userRepo.findAll();
    }
}
