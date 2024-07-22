package com.MyApp.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired

    @Qualifier("desktop")
    private computer com;

    public void build(){
        System.out.println("worling on awsome project");
        com.compiler();
    }
}
