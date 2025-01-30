package com.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfileApplication {

	public static void main(String[] args) {
		System.out.println("this is spring boot profiles");
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}

}
