package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
    @Autowired
    private MessageService messageService;

    public void processMessage(String msg) {
        messageService.sendMessage(msg);
    }
}
