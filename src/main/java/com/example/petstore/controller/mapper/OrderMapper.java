package com.example.petstore.controller.mapper;

import com.example.petstore.controller.dto.OrderDto;
import com.example.petstore.model.Order;
import com.example.petstore.model.Pet;
import com.example.petstore.service.PetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderMapper {
    private PetService petService;

    public OrderDto toRest(Order order) {
        return OrderDto.builder()
                .id(order.getId())
                .petId(order.getPet().getId())
                .quantity(order.getQuantity())
                .shipDate(order.getShipDate())
                .status(order.getStatus())
                .complete(order.isComplete())
                .build();
    }

    public Order toDomain(OrderDto orderDto) {
        Pet pet = petService.gitById(orderDto.getPetId());
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setPet(pet);
        order.setQuantity(order.getQuantity());
        order.setShipDate(orderDto.getShipDate());
        order.setStatus(orderDto.getStatus());
        order.setComplete(orderDto.isComplete());
        return order;
    }
}
