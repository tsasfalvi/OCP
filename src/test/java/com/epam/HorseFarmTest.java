package com.epam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HorseFarmTest {
    private HorseFarm underTest;

    @BeforeEach
    void setUp() {
        underTest = new HorseFarm();
    }

    @Test
    void getAnimals() {
        String expected = "Woof!\n" +
                "Woof!\n" +
                "Woof!\n" +
                "Meow!\n" +
                "Quack!\n" +
                "Nyihaha\n";

        String actual = underTest.sing();

        Assertions.assertEquals(expected, actual);
    }

}