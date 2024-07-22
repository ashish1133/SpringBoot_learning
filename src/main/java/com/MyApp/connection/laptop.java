package com.MyApp.connection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class laptop implements computer {
    public void compiler(){
        System.out.println("laptop is portable");
    }
}
