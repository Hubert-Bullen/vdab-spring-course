package com.realdolmen.spring.domain;

/**
 * Created by Hyuberuto on 10/06/15.
 */
public class MeatyFood extends Food {
    public MeatyFood(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
