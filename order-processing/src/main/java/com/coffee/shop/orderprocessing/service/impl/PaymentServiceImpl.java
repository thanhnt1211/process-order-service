package com.coffee.shop.orderprocessing.service.impl;

import com.coffee.shop.PaymentRequest;
import com.coffee.shop.orderprocessing.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String initiatePayment(PaymentRequest request) {
        return "";
    }
}
