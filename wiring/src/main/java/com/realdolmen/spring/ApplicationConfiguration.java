package com.realdolmen.spring;

import com.realdolmen.spring.service.Zoo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * Created by cda5732 on 25/03/2015.
 */
@SpringBootApplication
//@ActiveProfiles(" ") werkt niet hier , echt enkel in de test folders.
public class ApplicationConfiguration {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationConfiguration.class);
        // context.getEnvironment().addActiveProfile("production"); Deze kan ook gebruikt worden om de active profile aan te duiden.
        Zoo zoo = context.getBean(Zoo.class);
        System.out.println(zoo.getName());
        System.out.println("Nr. of Animals: " + zoo.countAnimals());
        // TODO call the method to feed the animals
        zoo.feedAnimals();

    }
}

