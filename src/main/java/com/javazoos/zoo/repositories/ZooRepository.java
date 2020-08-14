package com.javazoos.zoo.repositories;

import com.javazoos.zoo.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}
