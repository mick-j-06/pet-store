package com.example.petstore.service;

import com.example.petstore.model.Tag;
import com.example.petstore.repository.TagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TagService {
    private TagRepository tagRepository;

    public List<Tag> findAll() {
        return tagRepository.findAll();
    }
}
