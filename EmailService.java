package com.example.di;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
