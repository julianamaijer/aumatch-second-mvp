package com.fateczl.aumatch.service;

import com.fateczl.aumatch.exception.EntityNotFoundException;
import com.fateczl.aumatch.model.Animal;
import com.fateczl.aumatch.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal save(Animal animal){
        return animalRepository.save(animal);
    }

    public Animal update(Long animalId, Animal animal) {
        findById(animalId);
        return animalRepository.save(animal);
    }

    public void delete(Long animalId) {
        findById(animalId);
        animalRepository.delete(animalId);
    }

    public Animal findById(Long animalId){
        return animalRepository.findById(animalId).
                orElseThrow(() -> new EntityNotFoundException("Animal n - "));
    }
}
