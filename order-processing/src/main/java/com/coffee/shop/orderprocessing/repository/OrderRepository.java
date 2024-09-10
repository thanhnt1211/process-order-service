package com.coffee.shop.orderprocessing.repository;

import com.coffee.shop.orderprocessing.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
