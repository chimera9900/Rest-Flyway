package com.developer.storesws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;

@EnableHypermediaSupport(type = HypermediaType.HAL)
@SpringBootApplication
public class StoresWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoresWsApplication.class, args);
	}
	
	
	



}


