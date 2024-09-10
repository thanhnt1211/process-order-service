package com.coffee.shop.orderprocessing.mappers;

import com.coffee.shop.PaymentRequest;
import org.mapstruct.Mapper;

import java.math.BigDecimal;

@Mapper(componentModel = "spring")
public abstract class PaymentMapper {

    public abstract PaymentRequest buildPaymentRequest(String orderId, String customerId, BigDecimal amount);
}
