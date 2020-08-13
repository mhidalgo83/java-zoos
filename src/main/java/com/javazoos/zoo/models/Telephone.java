package com.javazoos.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "telephones")
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    @Column
    private String phonenumber;
    private String phonetype;


    @ManyToOne
    @JoinColumn(name = "zooid")
    private Zoo zoo;

    public Telephone() {
    }

    public Telephone(long phoneid, String phonenumber, String phonetype, Zoo zoo) {
        this.phoneid = phoneid;
        this.phonenumber = phonenumber;
        this.phonetype = phonetype;
        this.zoo = zoo;
    }
}
