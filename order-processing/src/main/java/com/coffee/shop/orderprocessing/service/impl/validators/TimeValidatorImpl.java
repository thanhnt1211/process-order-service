package com.coffee.shop.orderprocessing.service.impl.validators;

import com.coffee.shop.OrderDTO;
import com.coffee.shop.orderprocessing.service.ValidatorService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.util.Optional.ofNullable;

@Component
public class TimeValidatorImpl implements ValidatorService {

    // TODO - create client ShopApi to get operation time
    private final LocalTime startTime = LocalTime.of(9, 0, 0);
    private final LocalTime endTime = LocalTime.of(21, 0, 0);

    @Override
    public boolean isValid(OrderDTO orderDTO) {
        return ofNullable(orderDTO)
                .map(OrderDTO::getCreatedAt)
                .map(LocalDateTime::toLocalTime)
                .map(time -> time.isAfter(startTime) || time.isBefore(endTime))
                .orElse(false);
    }
}
