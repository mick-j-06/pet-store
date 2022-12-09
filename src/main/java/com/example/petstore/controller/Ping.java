package com.example.petstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {
    @GetMapping(value = "/ping")
    public String ping() {
        return "pong";
    }
}
