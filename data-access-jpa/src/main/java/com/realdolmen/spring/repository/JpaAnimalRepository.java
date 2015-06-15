package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import org.hibernate.sql.Select;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.sql.ResultSet;
import java.util.List;

@Repository
public class JpaAnimalRepository implements AnimalRepository{


    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(Animal animal) {
        em.persist(animal);

    }

    @Override
    public Animal findById(int id) {
        return em.find(Animal.class, id);
    }

    @Override
    public List<Animal> findAll() {
        TypedQuery<Animal> query = em.createQuery("Select a FROM Animal a", Animal.class);
        List<Animal> animals = query.getResultList();
        return animals;
    }

    @Override
    public void update(Animal animal) {
        em.merge(animal);

    }

    @Override
    public void remove(Animal animal) {
        em.remove(animal);

    }
    // TODO: create a transactional repository bean from this class

    // TODO: inject a persistence context

    // TODO: implement AnimalRepository

    // TODO: implement findById()

    // TODO: implement findAll()

    // TODO: implement create()

    // TODO: implement update()

    // TODO: implement delete()
}
 // In ifs  een enkele is een binaire or =  |  zal compilen omdat het dan de binaire code van beide vergelijken zal (of ze dus allebei true(1) zijn of allebe false(0) à