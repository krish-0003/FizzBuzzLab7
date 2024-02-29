package org.example;

public class FizzBuzz {

    public static String fizzBuzz(int inputNumber) {
        boolean isDivisibleBy3 = inputNumber % 3 == 0;
        boolean isDivisibleBy5 = inputNumber % 5 == 0;

        if (isDivisibleBy3 && isDivisibleBy5) {
            return "FizzBuzz";
        } else if (isDivisibleBy3) {
            return "Fizz";
        } else if (isDivisibleBy5) {
            return "Buzz";
        } else {
            return Integer.toString(inputNumber);
        }

    }
}
