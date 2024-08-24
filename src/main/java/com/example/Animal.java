package com.example;

import com.example.constants.AnimalKind;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if (animalKind.equals(AnimalKind.HERBIVORE.getDescription())) {
            return List.of("Трава", "Различные растения");
        } else if (animalKind.equals(AnimalKind.PREDATOR.getDescription())) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение " + AnimalKind.HERBIVORE.getDescription() + " или " + AnimalKind.PREDATOR.getDescription());
        }
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}
