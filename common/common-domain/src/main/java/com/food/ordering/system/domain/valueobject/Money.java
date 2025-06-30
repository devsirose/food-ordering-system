package com.food.ordering.system.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * A value object that wraps a BigDecimal to represent monetary values.
 * Encapsulates money-related operations and validation logic.
 */
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Money  {
    private final BigDecimal amount;

    public boolean isGreaterThanZero() {
        return amount != null && amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreaterThan(Money money) {
        return amount != null && money.amount.compareTo(amount) > 0;
    }

    public Money add(Money money) {
        return new Money(setScale(amount.add(money.amount)));
    }

    public Money subtract(Money money) {
        return new Money(setScale(amount.subtract(money.amount)));
    }

    public Money multiply(int multiplier) {
        return new Money(setScale(amount.multiply(BigDecimal.valueOf(multiplier))));
    }

    private BigDecimal setScale(BigDecimal amount) {
        return amount.setScale(2, RoundingMode.HALF_EVEN);
    }
}
