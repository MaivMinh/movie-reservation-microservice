package com.microservice.authservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
  private final JavaMailSender mailSender;

  public MailService(JavaMailSender mailSender) {
    this.mailSender = mailSender;
  }

  public boolean sendSimpleMail(String to, String subject, String text) {
    try {
      SimpleMailMessage message = new SimpleMailMessage();
      message.setText(text);
      message.setSubject(subject);
      message.setTo(to);
      mailSender.send(message);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean sendMailToResetPassword(String to, String subject, String host, String token) {
    String link = host + "/account/reset-password?token=" + token;
    String text = "Click the link to reset your password: " + link;
    return sendSimpleMail(to, subject, text);
  }
}
