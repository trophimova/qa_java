package com.example;

import com.example.constants.AnimalKind;
import com.example.constants.Sex;

import java.util.List;

public class Lion {

    boolean hasMane;
    Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        if (sex.equals(Sex.MALE.getDescription())) {
            hasMane = true;
        } else if (sex.equals(Sex.FEMALE.getDescription())) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - " + Sex.MALE.getDescription() + " или " + Sex.FEMALE.getDescription());
        }
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood(AnimalKind.PREDATOR.getDescription());
    }
}
