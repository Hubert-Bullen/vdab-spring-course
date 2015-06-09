package com.realdolmen.spring;

import com.realdolmen.spring.service.Cassette;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Hyuberuto on 09/06/15.
 */
public class CassetteConfigurationRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CassetteConfig.class);
        Cassette amv = context.getBean(Cassette.class);
        amv.play();


    }
}
