package com.example.petstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ping")
public class Ping {
    @GetMapping
    public String ping() {
        return "pong";
    }
}
