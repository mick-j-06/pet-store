package com.example.petstore.controller.exeption;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class MyExceptionHandler {
    @ExceptionHandler(value = {NotFoundException.class})
    public ResponseEntity<Object> exception(NotFoundException exception) {
        ApiResponse apiResponse = ApiResponse.builder()
                .code(404)
                .type(HttpStatus.NOT_FOUND)
                .message(exception.getMessage())
                .build();
        log.error(apiResponse.toString());
        return ResponseEntity
                .status(404)
                .body(apiResponse);
    }
}
