package com.javazoos.zoo.services;

import com.javazoos.zoo.models.Zoo;
import com.javazoos.zoo.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService {

    @Autowired
    ZooRepository zoorepos;

    @Override
    public List<Zoo> findAll() {
        List<Zoo> zooList = new ArrayList<>();
        zoorepos.findAll().iterator().forEachRemaining(zooList::add);
        return zooList;
    }

    @Override
    public Zoo findZooById(long id) {
        return zoorepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Zoo id " + id + " Not Found"));
    }

    @Override
    public Zoo save(Zoo zoo) {
        return zoo;
    }
}
