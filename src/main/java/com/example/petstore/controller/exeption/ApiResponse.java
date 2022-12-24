package com.example.petstore.controller.exeption;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class ApiResponse {
    private Integer code;
    private HttpStatus type;
    private String message;
}
