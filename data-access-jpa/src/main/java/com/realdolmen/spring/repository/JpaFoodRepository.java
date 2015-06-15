package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.DietEntry;
import com.realdolmen.spring.domain.Food;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class JpaFoodRepository implements FoodRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Food findFoodById(int id) {
        return em.find(Food.class,id);

    }

    @Override
    public List<Food> findAllFood() {

        TypedQuery<Food> query = em.createQuery("Select f FROM Food f", Food.class);
        List<Food> food = query.getResultList();
        return food;
    }

    @Override
    public List<Food> findFoodForAnimalType(Animal.Type type) {
        TypedQuery<DietEntry> query = em.createQuery("Select de FROM DietEntry de", DietEntry.class);
        List<DietEntry> foods= query.getResultList();
        List<Food> animalFoods = new ArrayList<>();
        for (DietEntry entry : foods){
            if (entry.getAnimalType() == type){
                animalFoods.add(entry.getFood());
            }
        }
        return animalFoods;
    }

    @Override
    public void removeFood(Food food) {
        em.remove(food);

    }
    // TODO: Create a transactional repository bean implementing FoodRepository

    // TODO: implement findFoodById()

    // TODO: implement findAllFood()

    // TODO: implement findFoodForAnimalType()

    // TODO: implement removeFood()
}
