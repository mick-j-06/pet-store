package com.example.petstore.controller;

import com.example.petstore.controller.dto.OrderDto;
import com.example.petstore.controller.mapper.OrderMapper;
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
    private OrderMapper orderMapper;

    @GetMapping
    public List<OrderDto> findAllOrder() {
        return orderService.findAll().stream().map(orderMapper::toRest).toList();
    }

}
