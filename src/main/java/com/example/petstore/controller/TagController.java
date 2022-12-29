package com.example.petstore.controller;

import com.example.petstore.controller.dto.TagDto;
import com.example.petstore.controller.mapper.TagMapper;
import com.example.petstore.service.TagService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/tags")
public class TagController {
    private TagService tagService;
    private TagMapper tagMapper;

    @GetMapping
    public List<TagDto> findTags() {
        return tagService.findAll().stream().map(tagMapper::toRest).toList();
    }
}
