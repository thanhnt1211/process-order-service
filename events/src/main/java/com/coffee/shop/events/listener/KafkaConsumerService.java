package com.coffee.shop.events.listener;

import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

public interface KafkaConsumerService {

    void listen(String message);

}