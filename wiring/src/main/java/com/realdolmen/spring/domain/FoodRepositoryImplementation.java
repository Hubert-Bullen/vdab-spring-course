package com.realdolmen.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hyuberuto on 09/06/15.
 */
public class FoodRepositoryImplementation implements FoodRepository {
    private Map<Class<? extends Animal>,Food> foodTypes = new HashMap<>();


    @Override
    public void addFoodForAnimalType(Class<? extends Animal> clazz, Food food) { // alle classes die extended van animal.
        foodTypes.put(clazz,food);

    }

    @Override
    public Food findFoodForAnimalType(Class<? extends Animal> clazz) {
        return foodTypes.get(clazz);

    }
}
