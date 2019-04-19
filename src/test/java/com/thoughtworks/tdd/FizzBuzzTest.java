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
}