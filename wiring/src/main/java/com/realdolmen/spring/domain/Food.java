package com.realdolmen.spring.domain;

/**
 * Created by Hyuberuto on 09/06/15.
 */
public abstract class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

