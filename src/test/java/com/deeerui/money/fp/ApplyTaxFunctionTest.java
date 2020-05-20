package com.deeerui.money.fp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ApplyTaxFunctionTest {
    ApplyTaxFunction applyTaxFunction;

    @BeforeEach
    void setUp() {
        applyTaxFunction = new ApplyTaxFunction();
    }
    @Test
    void apply() {
        BigDecimal amount = BigDecimal.valueOf(100);
        BigDecimal rate = BigDecimal.valueOf(0.2);
        assertEquals(0, applyTaxFunction.apply(amount, rate).compareTo(BigDecimal.valueOf(120)));
    }
}