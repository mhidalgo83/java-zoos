package com.javazoos.zoo.controllers;

import com.javazoos.zoo.models.Zoo;
import com.javazoos.zoo.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    @Autowired
    ZooService zooService;

    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> findZoos() {
    List<Zoo> allZoos = zooService.findAll();
    return new ResponseEntity<>(allZoos, HttpStatus.OK);
    }

    @GetMapping(value = "/zoo/{zooid}", produces = "application/json")
    public ResponseEntity<?> findZooById(@PathVariable long zooid) {
        Zoo zoo = zooService.findZooById(zooid);
        return new ResponseEntity<>(zoo, HttpStatus.OK);
    }

}
