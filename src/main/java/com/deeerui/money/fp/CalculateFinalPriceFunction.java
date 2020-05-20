package com.deeerui.money.fp;

import com.deeerui.money.config.DiscountConfiguration;
import com.deeerui.money.config.TaxConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.Function;

@Component
public class CalculateFinalPriceFunction implements Function<BigDecimal, BigDecimal> {
    private Function<BigDecimal, BigDecimal> applyTax;
    private Function<BigDecimal, BigDecimal> applyDiscount;

    @Override
    public BigDecimal apply(BigDecimal listingPrice) {
        return applyTax.compose(applyDiscount).apply(listingPrice);
    }

    @Autowired
    private void setApplyTax(TaxConfiguration taxConfiguration, ApplyTaxFunction applyTaxFunction) {
        this.applyTax = (BigDecimal listingPrice) -> applyTaxFunction.apply(listingPrice, taxConfiguration.getRate());
    }

    @Autowired
    private void setApplyDiscount(DiscountConfiguration discountConfiguration, ApplyDiscountFunction applyDiscountFunction, CheckDiscountEligibility checkDiscountEligibility) {
        this.applyDiscount = (BigDecimal listingPrice) -> checkDiscountEligibility.test(listingPrice, discountConfiguration.getThreshold())
                ? applyDiscountFunction.apply(listingPrice, discountConfiguration.getRate())
                : listingPrice;
    }
}
