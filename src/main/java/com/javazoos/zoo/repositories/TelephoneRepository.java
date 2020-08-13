package com.javazoos.zoo.repositories;

import com.javazoos.zoo.models.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepository extends CrudRepository<Telephone, Long> {
}
