package com.javazoos.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooAnimalId.class)
public class ZooAnimals extends Auditable implements Serializable {
    @Id
    @ManyToOne
    @JsonIgnoreProperties("animals")
    @JoinColumn(name = "zooid")
    private Zoo zoo;

    @Id
    @ManyToOne
    @JsonIgnoreProperties("zoos")
    @JoinColumn(name = "animalid")
    private Animal animal;

    @Column
    private String incomingzoo;

    public ZooAnimals() {
    }

    public ZooAnimals(Zoo zoo, Animal animal, String incomingzoo) {
        this.zoo = zoo;
        this.animal = animal;
        this.incomingzoo = incomingzoo;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getIncomingzoo() {
        return zoo.getZooname();
    }

    public void setIncomingzoo(Zoo zoo) {
        this.incomingzoo = zoo.getZooname() ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimals that = (ZooAnimals) o;

        return ((this.animal == null) ? 0 : this.getAnimal().getAnimalid()) == ((that.animal == null) ? 0 : that.getAnimal().getAnimalid()) &&
                ((this.zoo == null) ? 0 : this.getZoo().getZooid()) == ((that.zoo == null) ? 0 : that.getZoo().getZooid());

    }

    @Override
    public int hashCode() {
        return 37;
    }
}
