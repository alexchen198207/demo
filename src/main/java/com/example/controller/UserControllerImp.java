package com.example.controller;

import com.example.dao.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllerImp {
    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public void addUser(User user) {
        userService.addUser(user);
    }

    @GetMapping("/query")
    public User queryUser(String username) {
        return userService.queryUser(username);
    }


    @GetMapping("/delete")
    public void deleteUser(User username) {
        userService.deleteUser(username);
    }

    @GetMapping("/update")
    public void updateUser(User user) {
        userService.updateUser(user);
    }

}
