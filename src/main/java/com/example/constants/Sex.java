package com.example.constants;

public enum Sex {
    MALE("Самец"),
    FEMALE("Самка");

    private final String description;

    Sex(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
