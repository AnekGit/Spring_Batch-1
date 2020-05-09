package com.springboot.practice.MyAppPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {


		SpringApplication.run(MyAppApplication.class, args);
		System.out.println("Here is my Spring boot app");
	}

}
