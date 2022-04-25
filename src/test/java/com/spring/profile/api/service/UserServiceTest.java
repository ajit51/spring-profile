package com.spring.profile.api.service;

import com.spring.profile.api.entity.User;
import com.spring.profile.api.repo.UserRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Mock
    private UserRepo userRepo;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void findAllUserTest(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "dev-1"));
        users.add(new User(2, "dev-2"));
        users.add(new User(3, "dev-3"));
        users.add(new User(4, "dev-4"));

        when(userRepo.findAll()).thenReturn(users);

        Assertions.assertEquals(4, userService.findAllUser().size());
    }
}
