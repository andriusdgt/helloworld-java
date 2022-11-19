package com.example.project;

public class Cat implements Animal {

    private int livesLeft;
    private int age;

    public Cat(int livesLeft, int age) {
        this.livesLeft = livesLeft;
        this.age = age;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public int getAge() {
        return age;
    }

    public int calculateYearsToLive() {
        return livesLeft * 10 - age;
    }

    @Override
    public void feedAnimal() {
        System.out.println("Cat fed");
    }

    @Override
    public void petAnimal() {

    }

}
