package com.coffee.shop;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class ItemStock {
    private String itemId;
    private int quantity;
    private LocalDateTime importedDate;
    private LocalDateTime expiryDate;
    private Category category;
}
