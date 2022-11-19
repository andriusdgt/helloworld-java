package com.example.project;

import java.util.stream.Stream;

public class Main {

    public static String getHello() {
        return "Hello world!";
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Bartas", 5, 2);
        Dog anotherDog = new Dog("Zulikas", 100, 2);
        Cat cat = new Cat(9, 4);
        Squirel squirel = new Squirel();

        Stream.of(dog, anotherDog, cat, squirel)
                .map(animal -> {
                    printAnimalYearsToLive(animal);
                    return animal;
                })
                .forEach(Main::feedAnimals);
    }

    private static void printAnimalYearsToLive(Animal animal) {
        System.out.println(animal.calculateYearsToLive());
    }

    private static void feedAnimals(Animal animal) {
        animal.feedAnimal();
    }

}
