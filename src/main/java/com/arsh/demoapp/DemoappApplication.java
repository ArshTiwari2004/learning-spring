package com.arsh.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {

		ApplicationContext context  = SpringApplication.run(DemoappApplication.class, args); // to run the container

	    Hello obj = context.getBean(Hello.class);

		obj.build();


	}

}
