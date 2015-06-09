package com.realdolmen.spring.domain;

/**
 * Created by Hyuberuto on 09/06/15.
 */
public interface FoodRepository {

    void addFoodForAnimalType(Class<? extends Animal> clazz, Food food);

    Food findFoodForAnimalType(Class<? extends Animal> clazz);
}
