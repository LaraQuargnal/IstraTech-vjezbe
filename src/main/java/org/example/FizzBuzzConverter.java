package org.example;

// TDD
public class FizzBuzzConverter {
    public String convert(int convertToInt) {

        if (convertToInt%15==0){
            return "FizzBuzz";
        }
        if (convertToInt%3==0){
            return "Fizz";
        }

        if (convertToInt%5==0){
            return "Buzz";
        }



        return String.valueOf(convertToInt);

    }
}
