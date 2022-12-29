package com.example.petstore.controller;

import com.example.petstore.controller.dto.CategoryDto;
import com.example.petstore.controller.mapper.CategoryMapper;
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
    private CategoryMapper categoryMapper;

    @GetMapping
    public List<CategoryDto> findAllCategory() {
        return categoryService.findAll().stream().map(categoryMapper::toRest).toList();
    }
}
