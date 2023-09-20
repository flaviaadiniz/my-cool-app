package com.flavia.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
		scanBasePackages = {"com.flavia.springcoredemo",
							"com.flavia.utils"}
 */

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}
}