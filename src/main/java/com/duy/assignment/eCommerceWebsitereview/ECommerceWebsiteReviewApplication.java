package com.duy.assignment.eCommerceWebsitereview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ECommerceWebsiteReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceWebsiteReviewApplication.class, args);
	}

}
