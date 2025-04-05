package com.microservice.authservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class MailSenderConfig {

  @Bean
  public SimpleMailMessage simpleMailMessage() {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom("maivanminh.se@gmail.com");
    return message;
  }

}
