package com.application.superbank;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    private final BalanceRepository balanceRepository = new BalanceRepository();
    private final BankService bankService = new BankService(balanceRepository);

    @Test
    void getBalance() {
        final BigDecimal balance = bankService.getBalance(1L);
        assertEquals(balance,BigDecimal.TEN);
    }

    @Test
    void addMoney(){
        final BigDecimal balance = bankService.addMoney(1L,BigDecimal.ONE);
        assertEquals(balance,BigDecimal.valueOf(11));
    }
}