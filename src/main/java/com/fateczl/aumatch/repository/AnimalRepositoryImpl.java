package com.fateczl.aumatch.repository;

import com.fateczl.aumatch.model.Animal;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AnimalRepositoryImpl implements AnimalRepository{

    @Override
    public Animal save(Animal animal) {
        return animal;
    }

    @Override
    public Optional<Animal> findById(Long animalId) {
        return Optional.empty();
    }

    @Override
    public void delete(Long animalId) {
    }
}
