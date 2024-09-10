package com.coffee.shop.orderprocessing.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductOrderDetail {
    private String productId;
    private String productName;
    private Long quantity;
}