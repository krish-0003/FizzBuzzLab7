package org.example;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) { // we have made changes here
            return "Fizz";
        } else if (number % 3 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}
