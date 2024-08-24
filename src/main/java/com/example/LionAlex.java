package com.example;

import com.example.constants.Sex;

import java.util.List;

public class LionAlex extends Lion {
    public LionAlex(Feline feline) throws Exception {
        super(Sex.MALE.getDescription(), feline);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
}
