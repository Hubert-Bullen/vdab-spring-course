package com.realdolmen.spring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Hyuberuto on 09/06/15.
 */
@Service // 1 van de 4manieren om Component aan te tonen.
public class AwesomeMixVol1 implements Cassette {

    @Override
    public void play() {
        System.out.println("Currently playing: Escape (The Piña Colada Song) - Rupert Holmes");


    }
}
