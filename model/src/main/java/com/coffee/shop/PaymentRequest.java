package com.coffee.shop;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class PaymentRequest {
    private String orderId;
    private String customerId;
    private BigDecimal amount;
}
