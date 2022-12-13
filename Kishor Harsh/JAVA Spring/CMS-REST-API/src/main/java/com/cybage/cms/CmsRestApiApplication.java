package com.cybage.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.cybage")
public class CmsRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsRestApiApplication.class, args);
	}

}
