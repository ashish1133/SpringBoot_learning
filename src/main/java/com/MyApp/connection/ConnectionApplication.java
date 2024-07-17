package com.MyApp.connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConnectionApplication {

	public static void main(String[] args) {

		ApplicationContext context =
		SpringApplication.run(ConnectionApplication.class, args);

		Dev o = context.getBean(Dev.class);
		o.build();
	}

}
