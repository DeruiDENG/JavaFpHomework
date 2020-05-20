package com.deeerui.money;

import com.deeerui.money.config.DiscountConfiguration;
import com.deeerui.money.fp.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.math.BigDecimal;

@SpringBootApplication
@ConfigurationPropertiesScan({"com.deeerui.money.config"})
public class MoneyApplication implements CommandLineRunner {
    private final Application fpApplication;

    @Autowired
    MoneyApplication(Application fpApplication, DiscountConfiguration discountConfiguration) {
        this.fpApplication = fpApplication;
    }

    public static void main(String[] args) {
        SpringApplication.run(MoneyApplication.class, args);
    }

    @Override
    public void run(String... args) {
        BigDecimal originalPrice = new BigDecimal(100);
        BigDecimal result = fpApplication.calculate(originalPrice);
        System.out.println("Input:" + originalPrice);
        System.out.println("Output:" + result); // should be 88

        originalPrice = new BigDecimal(90);
        result = fpApplication.calculate(originalPrice);
        System.out.println("Input:" + originalPrice);
        System.out.println("Output:" + result); // should be 99

        originalPrice = new BigDecimal(95);
        result = fpApplication.calculate(originalPrice);
        System.out.println("Input:" + originalPrice);
        System.out.println("Output:" + result); // should be 104.5
    }
}
