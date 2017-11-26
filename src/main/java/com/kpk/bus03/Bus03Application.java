package com.kpk.bus03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Bus03Application {

	public static void main(String[] args) {
		SpringApplication.run(Bus03Application.class, args);
	}
}
