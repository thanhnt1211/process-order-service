package com.coffee.shop.orderprocessing.service.abstracts;

import com.coffee.shop.OrderDTO;
import com.coffee.shop.orderprocessing.exception.BadOrderException;
import com.coffee.shop.orderprocessing.service.InventoryService;
import com.coffee.shop.orderprocessing.service.ProcessOrderService;
import com.coffee.shop.orderprocessing.service.ValidatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractProcessOrderService implements ProcessOrderService {
    private final List<ValidatorService> validatorServices;

    @Override
    public void processOrder(OrderDTO orderDTO) {
        boolean isInvalid = validatorServices.stream().noneMatch(validator -> validator.isValid(orderDTO));
        if (isInvalid) {
            throw new BadOrderException("Invalid order");
        }
        initiatePaymentOrder(orderDTO);



        innerUpdateOrder(orderDTO);
    }

    protected abstract String initiatePaymentOrder(OrderDTO orderDTO);

    protected abstract void innerUpdateOrder(OrderDTO orderDTO);
}
