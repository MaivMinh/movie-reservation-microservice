package com.microservice.commentservice.service;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class RabbitMQService {
  private final AmqpAdmin amqpAdmin;
  private final FanoutExchange holdingExchange;
  private final Map<String, Queue> sessionQueues = new ConcurrentHashMap<>();

  public RabbitMQService(AmqpAdmin amqpAdmin) {
    this.amqpAdmin = amqpAdmin;
    this.holdingExchange = new FanoutExchange("holding");
    amqpAdmin.declareExchange(holdingExchange);
  }

  public int declareQueue(String queueName) {
    if (sessionQueues.containsKey(queueName)) {
      return HttpStatus.CREATED.value();
    }
    try {
      Queue queue = new Queue(queueName, true, false, true, null);
      amqpAdmin.declareQueue(queue);
      amqpAdmin.declareBinding(BindingBuilder.bind(queue).to(holdingExchange));
      sessionQueues.put(queueName, queue);
      return HttpStatus.OK.value();
    } catch (Exception e) {
      return HttpStatus.INTERNAL_SERVER_ERROR.value();
    }
  }

  public boolean removeQueue(String queueName) {
    try {
      amqpAdmin.deleteQueue(queueName);
      sessionQueues.remove(queueName);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
