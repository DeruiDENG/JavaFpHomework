package com.deeerui.money.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("money.discount")
public class DiscountConfiguration {
    private final double rate;
    private final double threshold;

    public double getRate() {
        return rate;
    }

    public double getThreshold() {
        return threshold;
    }

    public DiscountConfiguration(double rate, double threshold) {
        this.rate = rate;
        this.threshold = threshold;
    }
}
