package com.thoughtworks.tdd;

public class FizzBuzz {

    public String fizzBuzz(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                if (number % 7 == 0) {
                    return "FizzBuzzWhizz";
                }
                return "FizzBuzz";
            }
            if (number % 7 == 0) {
                return "FizzWhizz";
            }
            return "Fizz";
        } else if (number % 5 == 0) {
            if (number % 7 == 0) {
                return "BuzzWhizz";
            }
            return "Buzz";
        } else if (number % 7 == 0) {
            return "Whizz";
        }
        return number + "";
    }
}
