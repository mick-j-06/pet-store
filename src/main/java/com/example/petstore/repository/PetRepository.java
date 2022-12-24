package com.example.petstore.repository;

import com.example.petstore.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PetRepository extends JpaRepository<Pet, Integer> {
}
