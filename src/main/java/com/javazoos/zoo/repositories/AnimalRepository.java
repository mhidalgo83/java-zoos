package com.javazoos.zoo.repositories;

import com.javazoos.zoo.models.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
