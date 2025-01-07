package com.example.webclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebclientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebclientServiceApplication.class, args);
	}
}

