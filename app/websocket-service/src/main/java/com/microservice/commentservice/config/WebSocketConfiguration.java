package com.microservice.commentservice.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@RequiredArgsConstructor
@Order(Ordered.HIGHEST_PRECEDENCE + 99)
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {
  private final Environment env;
  public static final String[] BROKER_PREFIXES = new String[]{"/queue", "/topic"};

  /// Cấu hình STOMP protocol dùng để trao đổi message qua lại client - WebSocket Server.
  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    registry
            .addEndpoint("/bookings", "/comments")
            .setAllowedOrigins("*");
  }

  /// Cấu hình các BROKER prefix cho STOMP protocol.
  /// Các BROKER prefix này được sử dụng để phân biệt xem message sẽ tới "queue" hay "topic".
  /// Ví dụ: Nếu sử dụng AMQP thì sau khi process xong ở Controller, message sẽ chuyển tới "exchange" và sau khi "exchange" routing xong thì message này sẽ được forward tới các "queue" đã được binding với "exchange" này.
  @Override
  public void configureMessageBroker(MessageBrokerRegistry registry) {
    String host = env.getProperty("spring.messaging.stomp.broker.relay.host", String.class, "localhost");
    int port = env.getProperty("spring.messaging.stomp.broker.relay.port", Integer.class, 61613);


    registry.setPreservePublishOrder(true);
    registry.setApplicationDestinationPrefixes("/app")
            .enableStompBrokerRelay(BROKER_PREFIXES)
            .setRelayHost(host)
            .setRelayPort(port);
  }
}
