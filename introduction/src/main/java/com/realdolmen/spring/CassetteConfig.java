package com.realdolmen.spring;

import com.realdolmen.spring.service.AwesomeMixVol1;
import com.realdolmen.spring.service.Cassette;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Hyuberuto on 09/06/15.
 */
@Configuration
@ComponentScan
public class CassetteConfig {

   /* @Bean
    public Cassette cassette(){
        return new AwesomeMixVol1();
    }*/ // Niet meer nodig door @Component en @ComponentScan Maar dan kan de config niet meer in de config folder staan. Kan wel door de base package te veranderen.

}
