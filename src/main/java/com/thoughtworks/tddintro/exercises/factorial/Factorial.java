package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if(i == 0){
            return 1;
        }
        else if(i < 0){
            throw new IllegalArgumentException("Cannot compute the factorial of a negative number.");
        }
        else {
            return i * compute(i - 1);
        }
    }
}
