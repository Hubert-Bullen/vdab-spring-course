package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cda5732 on 13/04/2015.
 */
public class FoodRepositoryImpl implements FoodRepository {
    private Map<String, Food> feed = new HashMap<>();

    @Override
    public void addFoodForAnimalType(Class<? extends Animal> c, Food food) {
        feed.put(c.getName(), food);
    }

    @Override
    public Food findFoodForAnimalType(Class<? extends Animal> c) {
        return feed.get(c.getName());
    }
}
