package com.fateczl.aumatch.controller;

import com.fateczl.aumatch.exception.EntityNotFoundException;
import com.fateczl.aumatch.model.Animal;
import com.fateczl.aumatch.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Animal create(@RequestBody  Animal animal){
        return animalService.save(animal);
    }

   @PutMapping("/{animalId}")
   public ResponseEntity<?> update(@PathVariable Long animalId, @RequestBody Animal animal) {
       try{
           return ResponseEntity.ok(animalService.update(animalId,animal));
       }catch (EntityNotFoundException e){
           return ResponseEntity.notFound().build();
       }
   }

    @DeleteMapping("/{animalId}")
    public ResponseEntity<Animal> delete(@PathVariable Long animalId){
        try{
            animalService.delete(animalId);
            return ResponseEntity.noContent().build();
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{animalId}")
    public ResponseEntity<Animal> get(@PathVariable Long animalId) {
        try{
            return ResponseEntity.ok(animalService.findById(animalId));
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }
}
