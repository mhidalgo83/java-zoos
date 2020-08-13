package com.javazoos.zoo.services;

import com.javazoos.zoo.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    AnimalRepository animalrepos;

}
