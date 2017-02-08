package com.thoughtworks.tddintro.exercises.accountbalance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTests {
    Account account = new Account();

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        assertEquals(account.deposit(50), 50);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.deposit(150);
        assertEquals(account.withdraw(50), 100);
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        assertEquals(account.withdraw(50), 0);
    }
}
