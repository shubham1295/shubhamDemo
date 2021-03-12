package com.shubham.shubhamDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class ShubhamDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShubhamDemoApplication.class, args);
	}

}
