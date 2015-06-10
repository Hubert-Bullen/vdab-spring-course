package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.service.PairiDaiza;
import com.realdolmen.spring.service.Zoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by cda5732 on 25/03/2015.
 */
@Configuration
@ComponentScan // Niet vergeten! Het is niet omdat @AutoWired gebruikt word dat we geen @Component en @ComponentScan meer nodig is!
public class ZooConfig {
    @Bean
    public Zoo zoo() {
        Zoo zoo = new PairiDaiza("Pairi Daiza");
        zoo.addAnimal(new Tiger("Bengal Tiger"));
        zoo.addAnimal(new Elephant("Indian Elephant"));
        zoo.addAnimal(new Bear("Brown Bear"));
        return zoo;
    }
    // TODO Configure the FoodRepository
    @Bean // Deze gebruiken we als we er misschien meerdere willen maken of er gewoon een eigen invulling aangeven. @Component gebruiken we als we een singleton willen maken eigenlijk.
     // In deze case dus wel op de FDSImpl. @Component.
    @Profile("production") // de @Profile gebruiken we dan bij edit config bij de run. daar kunnen we bij VM options -Dspring.profiles.active=profilename toevoegen.
    public FoodRepository repository(){
        FoodRepository repository = new FoodRepositoryImplementation();
        repository.addFoodForAnimalType(Tiger.class,new MeatyFood("Raw Steak"));
        repository.addFoodForAnimalType(Bear.class,new MeatyFood("Raw Steak"));
        repository.addFoodForAnimalType(Elephant.class,new VegiFood("Raw Vegetables"));
        return repository;
    }
    // Hadden we niet @Component gebruikt bij FDSImpl. dan hadden we hier een @Bean ervoor moeten maken met daarin een setter voor repository die we linken aan bovenstaande methode.

    @Bean
    @Profile("test")
    public FoodRepository testRepository(){
        FoodRepository repository = new FoodRepositoryImplementation();
        repository.addFoodForAnimalType(Tiger.class,new Kibble("Kibble, Steak-flavoured"));
        repository.addFoodForAnimalType(Bear.class,new Kibble("Kibble, Steak-flavoured"));
        repository.addFoodForAnimalType(Elephant.class,new Kibble("Kibble, Vegi-flavoured"));
        return repository;
    }
}
