package com.coffee.shop;

import com.coffee.shop.constants.OrderStatus;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public class OrderDTO {
    private String id;
    private String customerId;
    private List<Item> items;
    private OrderStatus status;
    private BigDecimal totalPrice;
    private LocalDateTime createdAt;
}
