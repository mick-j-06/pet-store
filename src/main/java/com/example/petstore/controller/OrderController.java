package com.example.petstore.controller;

import com.example.petstore.model.Order;
import com.example.petstore.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/order")
public class OrderController {
    private OrderService orderService;

    @GetMapping
    public List<Order> findAllOrder() {
        return orderService.findAll();
    }

}
