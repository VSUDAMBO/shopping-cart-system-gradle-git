package com.cg.shoppingcartsystem.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableEurekaServer
@SpringBootApplication//(scanBasePackages = {"com.zuoyan.shoppingcartsystem.productservice"})
public class ProductserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
	}

}
