package com.coffee.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Item {
    private String id;
    private String name;
    private BigDecimal price;
}
