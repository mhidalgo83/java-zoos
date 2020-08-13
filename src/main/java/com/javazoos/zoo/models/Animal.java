package com.javazoos.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "animals")
public class Animal extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    @Column(nullable = false, unique = true)
    private String animaltype;

    @Column
    private String incomingzoo;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("animal")
    private Set<ZooAnimals> zooanimals = new HashSet<>();

    public Animal() {
    }

    public Animal(String animaltype, String incomingzoo) {
        this.animaltype = animaltype;
        this.incomingzoo = incomingzoo;
    }

    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    public String getIncomingzoo() {
        return incomingzoo;
    }

    public void setIncomingzoo(String incomingzoo) {
        this.incomingzoo = incomingzoo;
    }

    public Set<ZooAnimals> getZooanimals() {
        return zooanimals;
    }

    public void setZooanimals(Set<ZooAnimals> zooanimals) {
        this.zooanimals = zooanimals;
    }
}
