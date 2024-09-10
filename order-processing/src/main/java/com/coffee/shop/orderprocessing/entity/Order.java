package com.coffee.shop.orderprocessing.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order")
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "customer_id", nullable = false)
    private String customerId;
    @Column(name = "shop_id", nullable = false)
    private String shopId;
    @Column(name = "order_details", columnDefinition = "json")
    private ProductOrderDetail orderDetails;
    @Column(name = "queue_position")
    private int queuePosition;
    @Column(name = "status")
    private String status;
}



