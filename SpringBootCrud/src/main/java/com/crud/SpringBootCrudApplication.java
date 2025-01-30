package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		System.out.println("This is Spring boot crud operation...");
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

}
