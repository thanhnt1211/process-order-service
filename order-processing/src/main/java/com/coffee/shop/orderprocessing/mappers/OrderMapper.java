package com.coffee.shop.orderprocessing.mappers;

import com.coffee.shop.OrderDTO;
import com.coffee.shop.orderprocessing.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {

    public abstract Order buildOrderEntity(OrderDTO dto);
}
