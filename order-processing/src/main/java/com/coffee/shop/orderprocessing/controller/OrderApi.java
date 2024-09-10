package com.coffee.shop.orderprocessing.controller;

import com.coffee.shop.OrderDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/orders")
public interface OrderApi {

    @PostMapping
    void createOrder(@RequestBody OrderDTO orderDTO);

    @PutMapping
    void updateOrder(@RequestBody String orderId);
}
