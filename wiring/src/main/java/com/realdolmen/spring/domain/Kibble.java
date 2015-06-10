package com.realdolmen.spring.domain;

/**
 * Created by Hyuberuto on 10/06/15.
 */
public class Kibble extends Food {
    public Kibble(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
