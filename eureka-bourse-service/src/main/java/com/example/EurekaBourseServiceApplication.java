package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaBourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaBourseServiceApplication.class, args);
	}
}