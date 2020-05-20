package com.deeerui.money.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("money.tax")
public class TaxConfiguration {
    private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
