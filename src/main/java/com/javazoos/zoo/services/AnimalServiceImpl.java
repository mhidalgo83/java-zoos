package com.javazoos.zoo.services;

import com.javazoos.zoo.models.Animal;
import com.javazoos.zoo.repositories.AnimalRepository;
import com.javazoos.zoo.views.AnimalCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    AnimalRepository animalrepos;

    @Override
    public Animal save(Animal animal) {
        return animal;
    }

    @Override
    public List<AnimalCount> getAnimalCount() {
        List<AnimalCount> list = animalrepos.getAnimalCount();
        return list;
    }
}
