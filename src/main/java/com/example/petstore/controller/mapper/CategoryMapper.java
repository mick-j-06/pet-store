package com.example.petstore.controller.mapper;

import com.example.petstore.controller.dto.CategoryDto;
import com.example.petstore.model.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public CategoryDto toRest(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    public Category toDomain(CategoryDto categoryDto) {
        Category category = new Category();
        category.setId(category.getId());
        category.setName(category.getName());
        return category;
    }
}
