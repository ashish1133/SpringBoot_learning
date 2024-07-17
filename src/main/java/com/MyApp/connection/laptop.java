package com.MyApp.connection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class laptop implements computer {
    public void compiler(){
        System.out.println("Laptop is portable");
    }
}
