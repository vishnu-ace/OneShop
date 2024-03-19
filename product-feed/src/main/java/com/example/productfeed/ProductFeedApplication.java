package com.example.productfeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductFeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductFeedApplication.class, args);
	}

}
