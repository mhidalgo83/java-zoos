package com.javazoos.zoo.services;

import com.javazoos.zoo.models.Animal;
import com.javazoos.zoo.views.AnimalCount;

import java.util.List;

public interface AnimalService {

    Animal save(Animal animal);

    List<AnimalCount> getAnimalCount();
}
