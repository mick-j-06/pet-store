package com.example.petstore.service;

import com.example.petstore.model.Pet;
import com.example.petstore.repository.PetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PetService {
    private PetRepository petRepository;

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public Pet gitById(Integer id) {
        return petRepository.getReferenceById(id);
    }
}
