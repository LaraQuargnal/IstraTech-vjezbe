package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {

    @Test
    void convertNormalNumbers() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("1", fizzBuzz.convert(1));
        assertEquals("2", fizzBuzz.convert(2));

    }

    @Test
    void multiplesOfBoththreeandfive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("FizzBuzz", fizzBuzz.convert(15));

    }

    @Test
    void multiplesOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("Fizz", fizzBuzz.convert(3));

    }

    @Test
    void multiplesOfBuzz() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        assertEquals("Buzz", fizzBuzz.convert(5));

    }



}
