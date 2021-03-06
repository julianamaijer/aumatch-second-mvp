package com.fateczl.aumatch.repository;

import com.fateczl.aumatch.model.Animal;

import java.util.Optional;


public interface AnimalRepository {

    Animal save(Animal animal);

    Optional<Animal> findById(Long animalId);

    void delete(Long animalId);
}
