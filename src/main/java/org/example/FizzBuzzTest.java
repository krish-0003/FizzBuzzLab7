package org.example;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));//failing test: as it will not expect fizz
    }


}
