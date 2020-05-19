package com.deeerui.money;

import com.deeerui.money.fp.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class MoneyApplication implements CommandLineRunner {
    private final Application fpApplication;

    MoneyApplication(Application fpApplication) {
        this.fpApplication = fpApplication;
    }

    public static void main(String[] args) {
        SpringApplication.run(MoneyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        BigDecimal originalPrice = new BigDecimal(100);
        BigDecimal result = fpApplication.calculate(originalPrice);
        System.out.println("Input:" + originalPrice);
        System.out.println("Output:" + result); // should be 88

        originalPrice = new BigDecimal(90);
        result = fpApplication.calculate(originalPrice);
        System.out.println("Input:" + originalPrice);
        System.out.println("Output:" + result); // should be 99
    }
}
