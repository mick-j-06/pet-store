package com.example.petstore.controller.mapper;

import com.example.petstore.controller.dto.UserDto;
import com.example.petstore.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toRest(User user) {
        return UserDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .phone(user.getPhone())
                .build();
    }

    public User toDomain(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPhone(user.getPhone());
        return user;
    }
}
