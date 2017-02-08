package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    int balance = 0;

    public int deposit(int i) {
        return (balance += i);
    }

    public int withdraw(int i) {
        if(balance - i >= 0) {
            balance -= i;
        }
        return balance;
    }
}
