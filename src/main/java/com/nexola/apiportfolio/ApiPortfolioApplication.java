package com.nexola.apiportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiPortfolioApplication {

	public static void main(String[] args) {
		System.setProperty("https.protocols", "TLSv1");
		SpringApplication.run(ApiPortfolioApplication.class, args);
	}

}
k