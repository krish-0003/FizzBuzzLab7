package org.example;

import static org.example.FizzBuzz.*;
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // we have to iterate 1 to 100 as a refactor function
            System.out.println(fizzBuzz(i));
        }

    }
}