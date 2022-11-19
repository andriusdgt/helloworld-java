package com.example.project;

public class Dog implements Animal {

    private String name;
    private int barkCount;
    private int age;

    public Dog(String name, int barkCount, int age) {
        this.name = name;
        this.barkCount = barkCount;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getBarkCount() {
        return barkCount;
    }

    public int getAge() {
        return age;
    }

    public int calculateYearsToLive() {
        var bonusYears = name.charAt(0) == 'A' ? 1 : 0;
        return 20 + bonusYears + barkCount - age;
    }

    @Override
    public void feedAnimal() {
        System.out.println("Dog fed");
    }

    @Override
    public void petAnimal() {

    }

}
