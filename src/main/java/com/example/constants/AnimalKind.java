package com.example.constants;

public enum AnimalKind {
    PREDATOR("Хищник"),
    HERBIVORE("Травоядное");

    private final String description;

    AnimalKind(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
