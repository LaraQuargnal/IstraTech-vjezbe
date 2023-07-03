package org.example;

import org.junit.jupiter.api.Test;

public class toHundredTesting {
    @Test
    public void printTheNumbers() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.convert(i));
        }

    }
}
