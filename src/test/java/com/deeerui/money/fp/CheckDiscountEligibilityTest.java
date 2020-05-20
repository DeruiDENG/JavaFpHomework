package com.deeerui.money.fp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CheckDiscountEligibilityTest {
    CheckDiscountEligibility checkDiscountEligibility;
    @BeforeEach
    void setUp() {
        checkDiscountEligibility = new CheckDiscountEligibility();
    }

    @Test
    void test1() {
        BigDecimal amount = BigDecimal.valueOf(100);
        BigDecimal threshold = BigDecimal.valueOf(100);
        assertTrue(checkDiscountEligibility.test(amount, threshold));
    }

    @Test
    void test2() {
        BigDecimal amount = BigDecimal.valueOf(120);
        BigDecimal threshold = BigDecimal.valueOf(100);
        assertTrue(checkDiscountEligibility.test(amount, threshold));
    }

    @Test
    void test3() {
        BigDecimal amount = BigDecimal.valueOf(90);
        BigDecimal threshold = BigDecimal.valueOf(100);
        assertFalse(checkDiscountEligibility.test(amount, threshold));
    }
}