package com.example.petstore.controller;

import com.example.petstore.model.User;
import com.example.petstore.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController {
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }
}
