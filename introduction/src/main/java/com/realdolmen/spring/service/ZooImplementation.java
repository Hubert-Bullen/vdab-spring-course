package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hyuberuto on 09/06/15.
 */
public class ZooImplementation implements Zoo{
    private String zooName;
    private List<Animal> animals = new ArrayList<>(); // Altijd lists initialiseren!!!!

    public ZooImplementation(String zooName) {
        this.zooName = zooName;

    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);

    }

    @Override
    public void releaseAnimal(Animal animal) {
        animals.remove(animal);

    }

    @Override
    public boolean accept(Visitor visitor) {
        return false;
    }

    @Override
    public String getName() {
        return zooName;
    }

    @Override
    public int countAnimals() {
        return animals.size();
    }
}
