package com.example.petstore.controller;

import com.example.petstore.controller.dto.UserDto;
import com.example.petstore.controller.mapper.UserMapper;
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
    private UserMapper userMapper;

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll().stream().map(userMapper::toRest).toList();
    }
}
