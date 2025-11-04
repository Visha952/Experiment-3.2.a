package com.example.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
            new AnnotationConfigApplicationContext(AppConfig.class);
        MyApp app = ctx.getBean(MyApp.class);
        app.processMessage("Hello Spring Java Config!");
        ctx.close();
    }
}
