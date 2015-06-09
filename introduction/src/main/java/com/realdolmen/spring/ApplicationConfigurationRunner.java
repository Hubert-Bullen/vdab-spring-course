package com.realdolmen.spring;

import com.realdolmen.spring.service.Zoo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by cda5732 on 25/03/2015.
 */
@SpringBootApplication
public class ApplicationConfigurationRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationConfigurationRunner.class); // Door de @SpringBootApplication graaft hij dieper dan deze
        // en vind en gebruikt hij ALLE configs die hij vind.
        // TODO Fetch the Zoo class and print out its name and its animal count
        Zoo pride = context.getBean(Zoo.class);
        System.out.println();
        System.out.println("Amount of animals in " + pride.getName() + ": " +pride.countAnimals());
        System.out.println();
        context.close();
        // TODO Test your code by running this main
    }
}
