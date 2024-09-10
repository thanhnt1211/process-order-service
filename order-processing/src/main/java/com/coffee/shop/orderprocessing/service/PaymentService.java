package com.coffee.shop.orderprocessing.service;

import com.coffee.shop.PaymentRequest;

public interface PaymentService {

    String initiatePayment(PaymentRequest request);
}
