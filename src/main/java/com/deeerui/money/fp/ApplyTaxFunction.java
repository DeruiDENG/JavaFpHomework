package com.deeerui.money.fp;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.BiFunction;

@Component
public class ApplyTaxFunction implements BiFunction<BigDecimal, BigDecimal, BigDecimal> {
    @Override
    public BigDecimal apply(BigDecimal price, BigDecimal taxRate) {
        return price.add(price.multiply(taxRate));
    }
}
