package com.example.petstore.controller;

import com.example.petstore.model.Tag;
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

    @GetMapping
    public List<Tag> findTags() {
        return tagService.findAll();
    }
}
