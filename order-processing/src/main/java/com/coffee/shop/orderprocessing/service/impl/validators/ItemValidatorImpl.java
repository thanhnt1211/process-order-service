package com.coffee.shop.orderprocessing.service.impl.validators;

import com.coffee.shop.Item;
import com.coffee.shop.OrderDTO;
import com.coffee.shop.orderprocessing.service.InventoryService;
import com.coffee.shop.orderprocessing.service.ValidatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class ItemValidatorImpl implements ValidatorService {
    private final InventoryService inventoryService;

    @Override
    public boolean isValid(OrderDTO orderDTO) {
        return orderDTO.getItems().stream().map(Item::getId).map(inventoryService::getItemStockDetail)
                .allMatch(itemStock -> itemStock.getQuantity() > 0 && itemStock.getExpiryDate().isAfter(LocalDateTime.now()));
    }
}
