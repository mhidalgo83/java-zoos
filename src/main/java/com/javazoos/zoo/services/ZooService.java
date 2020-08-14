package com.javazoos.zoo.services;

import com.javazoos.zoo.models.Zoo;

import java.util.List;

public interface ZooService {
    List<Zoo> findAll();

    Zoo findZooById(long id);
    Zoo save(Zoo zoo);
}
