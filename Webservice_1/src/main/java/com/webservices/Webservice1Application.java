package com.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Webservice1Application {

	public static void main(String[] args) {
		System.out.println("This is webservice");
		SpringApplication.run(Webservice1Application.class, args);
	}

}
