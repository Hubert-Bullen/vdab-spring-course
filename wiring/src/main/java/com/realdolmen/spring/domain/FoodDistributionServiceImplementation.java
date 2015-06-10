package com.realdolmen.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Hyuberuto on 09/06/15.
 */
@Component
public class FoodDistributionServiceImplementation implements FoodDistributionService {

    @Autowired
    private FoodRepository repository;


    public FoodDistributionServiceImplementation() {
    }

    @Override
    public void feedAnimalsByType(List<Animal> animals) {
        for (Animal a : animals){
            a.feed(repository.findFoodForAnimalType(a.getClass()));
        }


    }
}
