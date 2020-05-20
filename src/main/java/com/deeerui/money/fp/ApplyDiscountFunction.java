package com.deeerui.money.fp;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.BiFunction;

@Component
public class ApplyDiscountFunction implements BiFunction<BigDecimal, BigDecimal, BigDecimal> {
    @Override
    public BigDecimal apply(BigDecimal price, BigDecimal discountRate) {
        return price.subtract(price.multiply(discountRate));
    }
}
