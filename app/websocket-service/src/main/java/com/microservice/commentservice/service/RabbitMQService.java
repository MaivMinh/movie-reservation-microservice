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
    Queue queue = new Queue(queueName, true, false, true, null);
    amqpAdmin.declareQueue(queue);
    amqpAdmin.declareBinding(BindingBuilder.bind(queue).to(holdingExchange));
    sessionQueues.put(queueName, queue);
    return HttpStatus.OK.value();
  }

  public void removeQueue(String queueName) {
    amqpAdmin.deleteQueue(queueName);
    sessionQueues.remove(queueName);
  }
}
