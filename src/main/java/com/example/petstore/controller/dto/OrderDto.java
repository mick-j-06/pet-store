package com.example.petstore.controller.dto;

import com.example.petstore.model.enumType.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class OrderDto {
    private Integer id;
    private Integer petId;
    private Integer quantity;
    private Instant shipDate;
    private OrderStatus status;
    private boolean complete;
}
