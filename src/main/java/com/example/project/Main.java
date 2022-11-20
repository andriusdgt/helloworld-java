package com.example.project;

import java.util.List;

public class Main {

    public static String getHello() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        var dog = new Dog("Bartas", new Count(5, 2));
        var anotherDog = new Dog("Zulikas", new Count(100, 2));
        var cat = new Cat(9, 4);
        var squirel = new Squirel(2);
        var snake = new Animal.Snake(22);

        AnimalService animalService = new AnimalService();
        List.of(dog, anotherDog, cat, squirel, snake)
                .forEach(animal -> {
                    System.out.println(animalService.calculateYearsToLive(animal));
                    animalService.pet(animal);
                    animalService.feed(animal);
                });
    }

}
