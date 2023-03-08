package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {
	
	private static final String REST_URL="https://flipcat.com";

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		System.out.println("------chnaes 134");
	}

}
