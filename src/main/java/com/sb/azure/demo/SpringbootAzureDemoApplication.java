package com.sb.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureDemoApplication {
	
	@GetMapping("/greet")
	public String greet() {
		return "Congratulations! Hey, Greetings from Azure Platform";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureDemoApplication.class, args);
	}

}
