package com.coffee.shop.orderprocessing.service;

import com.coffee.shop.OrderDTO;

public interface ProcessOrderService {

    void processOrder(OrderDTO orderDTO);
}
