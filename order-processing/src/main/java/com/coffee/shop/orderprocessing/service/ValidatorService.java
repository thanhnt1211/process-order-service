package com.coffee.shop.orderprocessing.service;

import com.coffee.shop.OrderDTO;

public interface ValidatorService {
    boolean isValid(OrderDTO orderDTO);
}
