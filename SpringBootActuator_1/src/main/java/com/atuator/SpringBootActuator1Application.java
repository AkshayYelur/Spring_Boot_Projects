package com.atuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuator1Application {

	public static void main(String[] args) {
		System.out.println("This is spring boot actuator");
		SpringApplication.run(SpringBootActuator1Application.class, args);
	}

}
