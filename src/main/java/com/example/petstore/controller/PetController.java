package com.example.petstore.controller;

import com.example.petstore.model.Pet;
import com.example.petstore.repository.PetRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/pets")
public class PetController {
    private PetRepository petRepository;

    @GetMapping
    public List<Pet> findPets() {
        return petRepository.findAll();
    }
}
