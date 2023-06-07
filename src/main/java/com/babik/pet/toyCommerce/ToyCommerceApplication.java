package com.babik.pet.toyCommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.babik.pet.toyCommerce.*")
@ComponentScan(basePackages = {"com.babik.pet.toyCommerce.*" })
@EntityScan("com.babik.pet.toyCommerce.*")
@SpringBootApplication
public class ToyCommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToyCommerceApplication.class, args);
	}

}
