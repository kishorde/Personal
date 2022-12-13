package com.cybage.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.cybage")
public class PmsRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsRestApiApplication.class, args);
	}
	
//	@Bean
//	public RestTemplate getRestTemplate()
//	{
//		return new RestTemplate();
//	}


}