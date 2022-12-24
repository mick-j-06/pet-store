package com.example.petstore.controller;

import com.example.petstore.controller.exeption.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class Ping {
    @GetMapping(value = "/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping(value = "/exception")
    public String test() {
        throw new NotFoundException("non implemented");
    }
}
