package com.deeerui.money.fp;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.BiPredicate;

@Component
public class CheckDiscountEligibility implements BiPredicate<BigDecimal, BigDecimal> {
    @Override
    public boolean test(BigDecimal amount, BigDecimal threshold) {
        return amount.compareTo(threshold) >= 0;
    }
}
