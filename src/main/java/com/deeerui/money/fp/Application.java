package com.deeerui.money.fp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Application {
    private final CalculateFinalPriceFunction calculateFinalPriceFunction;

    @Autowired
    public Application(CalculateFinalPriceFunction calculateFinalPriceFunction) {
        this.calculateFinalPriceFunction = calculateFinalPriceFunction;
    }

    public BigDecimal calculate(BigDecimal originalPrice) {
        return calculateFinalPriceFunction.apply(originalPrice);
    }
}
