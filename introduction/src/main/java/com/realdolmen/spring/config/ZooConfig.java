package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.*;
import com.realdolmen.spring.service.Zoo;
import com.realdolmen.spring.service.ZooImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by Hyuberuto on 09/06/15.
 */

@Configuration
public class ZooConfig {

    @Bean
    public Zoo zoo() throws Exception{
        Zoo pride = new ZooImplementation("Pride Rock");
        pride.addAnimal(new Meerkat("Timon",Allegiance.SIMBA,Gender.MALE));
        pride.addAnimal(new Warthog("Pumbaa",Allegiance.SIMBA,Gender.MALE));
        pride.addAnimal(new Lion(" ",Allegiance.SIMBA,Gender.MALE));
        pride.addAnimal(new Toucan("Zazou",Allegiance.SIMBA,Gender.MALE));
        pride.addAnimal(new Baboon("Rafiki",Allegiance.SIMBA,Gender.MALE));
        pride.addAnimal(new Lion("Scar",Allegiance.SCAR,Gender.MALE));
        pride.addAnimal(new Hyena("Ed",Allegiance.SCAR,Gender.MALE));
        pride.addAnimal(new Hyena("Banzai",Allegiance.SCAR,Gender.MALE));
        pride.addAnimal(new Hyena("Shenzi",Allegiance.SCAR,Gender.FEMALE));
        return pride; // injecting the quest bean
    }

}
