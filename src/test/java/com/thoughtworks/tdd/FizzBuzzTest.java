package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    @Test
    public void fizz_buzz_test() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(2);

        assertThat(actual, is("2"));
    }

    @Test
    public void fizz_buzz_test_fizz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(3);

        assertThat(actual, is("Fizz"));
    }

    @Test
    public void fizz_buzz_test_buzz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(5);

        assertThat(actual, is("Buzz"));
    }
}
