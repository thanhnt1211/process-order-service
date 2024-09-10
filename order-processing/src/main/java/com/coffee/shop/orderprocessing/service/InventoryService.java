package com.coffee.shop.orderprocessing.service;

import com.coffee.shop.ItemStock;

public interface InventoryService {

    ItemStock getItemStockDetail(String itemId);
}
