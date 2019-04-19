package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FizzBuzzTest {

    @Test
    void fizz_buzz_test() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(2);

        assertThat(actual, is("2"));
    }

    @Test
    void fizz_buzz_test_fizz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(3);

        assertThat(actual, is("Fizz"));
    }

    @Test
    void fizz_buzz_test_buzz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(5);

        assertThat(actual, is("Buzz"));
    }

    @Test
    void fizz_buzz_test_whizz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(7);

        assertThat(actual, is("Whizz"));
    }

    @Test
    void fizz_buzz_test_fizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(15);

        assertThat(actual, is("FizzBuzz"));
    }

    @Test
    void fizz_buzz_test_fizzWhizz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(21);

        assertThat(actual, is("FizzWhizz"));
    }

    @Test
    void fizz_buzz_test_buzzWhizz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(35);

        assertThat(actual, is("BuzzWhizz"));
    }

    @Test
    void fizz_buzz_test_fizzBuzzWhizz() {
        FizzBuzz fb = new FizzBuzz();
        String actual = fb.fizzBuzz(105);

        assertThat(actual, is("FizzBuzzWhizz"));
    }
}
