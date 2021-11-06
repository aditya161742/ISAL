package com.isal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/isal")
public class IsalApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsalApplication.class, args);
	}
	
	@GetMapping
	public String isalTest() {
		return "ISAL service called";
	}
}
