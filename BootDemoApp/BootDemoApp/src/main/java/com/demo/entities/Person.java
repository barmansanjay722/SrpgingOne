package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private Integer personId;
    private String personName;
    private String personCity;

    public Person(Integer personId, String personName, String personCity) {
        this.personId = personId;
        this.personName = personName;
        this.personCity = personCity;
    }

    public Person() {
    }
}
