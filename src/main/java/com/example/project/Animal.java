package com.example.project;

public sealed interface Animal permits Animal.Snake, Cat, Dog, Squirrel {

    record Snake(int age) implements Animal {
    }

}
