package com.deeerui.money.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.math.BigDecimal;

@ConstructorBinding
@ConfigurationProperties("money.discount")
public class DiscountConfiguration {
    private final BigDecimal rate;
    private final BigDecimal threshold;

    public BigDecimal getRate() {
        return rate;
    }

    public BigDecimal getThreshold() {
        return threshold;
    }

    public DiscountConfiguration(BigDecimal rate, BigDecimal threshold) {
        this.rate = rate;
        this.threshold = threshold;
    }
}
