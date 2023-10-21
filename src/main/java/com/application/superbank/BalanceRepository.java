package com.application.superbank;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository

public class BalanceRepository {
    private final Map<Long, BigDecimal> storage = new HashMap<>(Map.of(1L,BigDecimal.TEN));

    public BigDecimal getBalanceForId(Long accauntId) {
    return storage.get(accauntId);
    }

    public void save(Long id, BigDecimal amount) {
        storage.put(id,amount);
    }
}
