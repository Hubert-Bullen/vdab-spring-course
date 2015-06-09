package com.realdolmen.spring.domain;

/**
 * Created by Hyuberuto on 09/06/15.
 */
public abstract class Animal {
    private String name;
    private Allegiance allegiance;
    private Gender gender;

    public Animal(String name, Allegiance allegiance, Gender gender) {
        this.name = name;
        this.allegiance = allegiance;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Allegiance getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(Allegiance allegiance) {
        this.allegiance = allegiance;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

//TODO Add field Allegiance (Enum) , Gender (Enum).
