package com.deeerui.money.fp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplyDiscountFunctionTest {
    ApplyDiscountFunction applyDiscountFunction;

    @BeforeEach
    void setUp() {
        applyDiscountFunction = new ApplyDiscountFunction();
    }

    @Test
    void applyDiscount() {
        BigDecimal amount = BigDecimal.valueOf(100);
        BigDecimal rate = BigDecimal.valueOf(0.2);
        assertEquals(0, applyDiscountFunction.apply(amount, rate).compareTo(BigDecimal.valueOf(80)));
    }
}