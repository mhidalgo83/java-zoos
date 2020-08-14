package com.javazoos.zoo.repositories;

import com.javazoos.zoo.models.Animal;
import com.javazoos.zoo.views.AnimalCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long> {

    @Query(value = "SELECT a.animalid AS animalid, a.animaltype AS animaltype, COUNT(zooid) AS countzoos " +
            "FROM animals a LEFT JOIN zooanimals z " +
            "ON a.animalid = z.animalid " +
            "GROUP BY a.animaltype", nativeQuery = true)
    List<AnimalCount> getAnimalCount();

}
