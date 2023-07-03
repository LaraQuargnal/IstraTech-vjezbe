package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test2 {


    @Test
    public void printTheNumbers() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.convert(i));
        }
    }
}