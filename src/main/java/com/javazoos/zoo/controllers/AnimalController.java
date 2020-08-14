package com.javazoos.zoo.controllers;

import com.javazoos.zoo.models.Animal;
import com.javazoos.zoo.services.AnimalService;
import com.javazoos.zoo.views.AnimalCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/animals")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> findAnimalNums() {
        List<AnimalCount> animalList = animalService.getAnimalCount();
        return new ResponseEntity<>(animalList, HttpStatus.OK);
    }
}
