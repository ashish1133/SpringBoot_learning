package com.MyApp.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    @Qualifier("laptop")
    private computer computer;

    public void build(){
        System.out.println("Working in awsome project");

        computer.compiler();
    }
}
