package com.coffee.shop.events.listener.impl;

import com.coffee.shop.events.listener.KafkaConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.KafkaException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    @KafkaListener(id = "message_01", topics = "topic", groupId = "shop", autoStartup = "false", containerFactory = "factory")
    public void listen(String message) {
        try {
//            log.info("ConsumerController message from vitality with {}, message body: {}", key, message);

        } catch (KafkaException e) {
//            log.error("Prepare message push notification has error: {} with message key: {}", e.getMessage(), key);
        }
    }
}