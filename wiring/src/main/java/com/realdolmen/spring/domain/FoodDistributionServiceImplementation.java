package com.realdolmen.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Hyuberuto on 09/06/15.
 */
public class FoodDistributionServiceImplementation implements FoodDistributionService {

    private FoodRepository repository;

    @Autowired
    public FoodRepository getRepository() {
        return repository;
    }

    @Override
    public void feedAnimalsByType(List<Animal> animals) {
        for (Animal a : animals){
            a.feed(repository.findFoodForAnimalType(a.getClass()));
        }


    }
}
