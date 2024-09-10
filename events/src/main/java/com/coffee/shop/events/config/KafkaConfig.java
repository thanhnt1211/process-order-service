package com.coffee.shop.events.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.kafka")
public class KafkaConfig {
    private String saslUsername;
    private String saslPassword;
    private String bootstrapServer;
    private String securityProtocol;
    private String saslMechanism;
    private String securityProtocolText;
    private String saslAdminUsername;
    private String saslAdminPassword;
    private String groupId;
    private String clientId;
}