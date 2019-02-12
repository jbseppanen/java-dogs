package com.lambdaschool.javadogs;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data //Creates getters, setters, toString
@Entity //Object ready for JPA storage
public class Dog {
    private @Id @GeneratedValue Long id;
    String breed;
    int weight;
    boolean apartmentOK;


    public Dog(String breed, int weight, boolean apartmentOK) {
        this.breed = breed;
        this.weight = weight;
        this.apartmentOK = apartmentOK;
    }

    public Dog() {
    }

}
