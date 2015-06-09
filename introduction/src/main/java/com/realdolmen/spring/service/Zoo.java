package com.realdolmen.spring.service;


import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.service.Visitor;

/**
 * Created by Hyuberuto on 09/06/15.
 */
public interface Zoo {

    void addAnimal(Animal animal);
    void releaseAnimal(Animal animal);
    boolean accept(Visitor visitor);
    String getName();
    int countAnimals();
}
