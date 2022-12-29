package com.example.petstore.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UserDto {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
