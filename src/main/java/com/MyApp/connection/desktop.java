package com.MyApp.connection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class desktop implements computer {
    public void compiler(){

        System.out.println("dektop is portable");
    }
}
