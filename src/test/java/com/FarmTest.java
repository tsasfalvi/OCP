package com;
import com.Farm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class FarmTest {
    private Farm underTest;

    @BeforeEach
    void setUp() {
        underTest = new Farm();
    }

    @Test
    void sing() {
        String expected = "Woof!\n" +
                "Woof!\n" +
                "Woof!\n" +
                "Meow!\n" +
                "Quack!\n";

        String actual = underTest.sing();

        Assertions.assertEquals(expected, actual);
    }

}