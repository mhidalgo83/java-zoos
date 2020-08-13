package com.javazoos.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "zoos")
public class Zoo extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    @Column(nullable = false, unique = true)
    private String zooname;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("zoo")
    private Set<Telephone> phonenumbers = new HashSet<>();

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("zoo")
    private Set<ZooAnimals> animals = new HashSet<>();

    public Zoo() {
    }

    public Zoo(String zooname) {
        this.zooname = zooname;
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public Set<Telephone> getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(Set<Telephone> phonenumbers) {
        this.phonenumbers = phonenumbers;
    }

    public Set<ZooAnimals> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<ZooAnimals> animals) {
        this.animals = animals;
    }
}
