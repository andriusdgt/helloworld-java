package com.example.project;

public class AnimalService {

    public int calculateYearsToLive(Animal animal) {
        switch (animal) {
            case Cat(int livesLeft,int age) when age < 5 -> {
                return livesLeft * 10 - age;
            }
            case Cat ignored -> {
                return 100;
            }
            case Dog(String name,Count(int barkCount,int age)) -> {
                var bonusYears = name.charAt(0) == 'A' ? 1 : 0;
                return 20 + bonusYears + barkCount - age;
            }
            case Squirel(int age) -> {
                return 10 - age;
            }
            case Animal.Snake snake -> {
                return 100 - snake.age();
            }
        }
        return 0;
    }

    public void feed(Animal animal) {
        switch (animal) {
            case Cat ignored -> System.out.println("cat fed");
            case Dog ignored -> System.out.println("dog fed");
            case Squirel ignored -> System.out.println("squirel fed");
            case Animal.Snake ignored -> System.out.println("snake fed");
        }
    }


    public void pet(Animal animal) {
        switch (animal) {
            case Cat ignored -> System.out.println("cat pet");
            case Dog ignored -> System.out.println("dog pet");
            case Squirel ignored -> System.out.println("squirel pet");
            case Animal.Snake ignored -> System.out.println("snake pet");
        }
    }

    public void sleep(Animal animal) {
        switch (animal) {
            case Cat cat -> {
            }
            case Dog dog -> {
            }
            case Squirel squirel -> {
            }
            case Animal.Snake snake -> {
            }
        }
    }

}
