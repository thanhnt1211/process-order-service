package com.coffee.shop.orderprocessing.service.impl;

import com.coffee.shop.OrderDTO;
import com.coffee.shop.PaymentRequest;
import com.coffee.shop.orderprocessing.entity.Order;
import com.coffee.shop.orderprocessing.mappers.OrderMapper;
import com.coffee.shop.orderprocessing.mappers.PaymentMapper;
import com.coffee.shop.orderprocessing.repository.OrderRepository;
import com.coffee.shop.orderprocessing.service.InventoryService;
import com.coffee.shop.orderprocessing.service.PaymentService;
import com.coffee.shop.orderprocessing.service.ValidatorService;
import com.coffee.shop.orderprocessing.service.abstracts.AbstractProcessOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessOrderServiceImpl extends AbstractProcessOrderService {
    private final OrderRepository orderRepository;

    private final OrderMapper orderMapper;
    private final PaymentMapper paymentMapper;

    private final PaymentService paymentService;

    public ProcessOrderServiceImpl(List<ValidatorService> validatorServices,
                                   OrderRepository orderRepository, OrderMapper orderMapper,
                                   PaymentMapper paymentMapper, PaymentService paymentService) {
        super(validatorServices);
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.paymentMapper = paymentMapper;
        this.paymentService = paymentService;
    }

    @Override
    protected String initiatePaymentOrder(OrderDTO dto) {
        PaymentRequest request = paymentMapper.buildPaymentRequest(dto.getId(), dto.getCustomerId(), dto.getTotalPrice());
        return paymentService.initiatePayment(request);
    }

    @Override
    protected void innerUpdateOrder(OrderDTO orderDTO) {
        Order entity = orderMapper.buildOrderEntity(orderDTO);
        orderRepository.save(entity);
    }
}
