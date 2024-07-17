package com.MyApp.connection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements computer {
    public void compiler(){

        System.out.println("Desktop is powerfull");
    }
}
