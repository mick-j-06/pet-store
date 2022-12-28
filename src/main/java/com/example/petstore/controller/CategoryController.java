package com.example.petstore.controller;

import com.example.petstore.model.Category;
import com.example.petstore.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/category")
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping
    public List<Category> findAllCategory() {
        return categoryService.findAll();
    }
}
