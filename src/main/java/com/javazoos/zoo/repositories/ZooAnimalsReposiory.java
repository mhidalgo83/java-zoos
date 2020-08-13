package com.javazoos.zoo.repositories;

import com.javazoos.zoo.models.ZooAnimals;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalsReposiory extends CrudRepository<ZooAnimals, Long> {
}
