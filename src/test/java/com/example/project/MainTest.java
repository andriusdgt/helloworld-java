package com.example.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void mainTest() {
        assertEquals("Hello world!", Main.getHello());
    }

}